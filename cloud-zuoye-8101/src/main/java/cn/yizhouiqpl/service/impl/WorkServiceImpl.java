package cn.yizhouiqpl.service.impl;

import cn.yizhouiqpl.entity.Student;
import cn.yizhouiqpl.entity.Work;
import cn.yizhouiqpl.entity.WorkVO;
import cn.yizhouiqpl.entity.Zuoye;
import cn.yizhouiqpl.enums.zuoye.ZuoyeStatus;
import cn.yizhouiqpl.mapper.StudentMapper;
import cn.yizhouiqpl.mapper.WorkMapper;
import cn.yizhouiqpl.service.WorkService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Slf4j
public class WorkServiceImpl extends ServiceImpl<WorkMapper, Work>
    implements WorkService{

    @Resource
    private WorkMapper workMapper;

    @Resource
    private StudentMapper studentMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void checkWork(Zuoye overdueZuoye) {
        log.info("插入未完成学生作业情况");

        // 根据 zuoye 中的 cId 将该班级中所有的学生（未请假）查询出来
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.eq("s_cid", overdueZuoye.getzCid());
//                .eq("s_status", 1);
        List<Student> students = studentMapper.selectList(wrapper);

        // 根据 zuoye 中的 zId 查询出已提交 work 表中的学生 sId
        List<Integer> sidList = workMapper.getSidByZid(overdueZuoye.getzId());

        students.forEach(student -> {
            // 提交作业学生名单中没有的学生，将该学生的信息插入 work ，设置状态为未提交
            if (!sidList.contains(student.getsId())) {
                Work work = new Work();
                work.setwSid(student.getsId());
                work.setwZid(overdueZuoye.getzId());
                // 将该生的 作业提交状态设置为 `未提交`
                work.setwStatus(ZuoyeStatus.UNCOMMITTED.getType());
                if (0 == student.getsStatus()) {
                    work.setwDesc("该生请假");
                }
                workMapper.insert(work);
            }
        });
    }

    @Override
    public List<WorkVO> getWorkList(String date, int status) {
        String statusStr = null;
        if (1 == status) { // 待审批
            statusStr = ZuoyeStatus.UNCORRECTED.getType();
        } else if (2 == status) { // 未提交
            statusStr = ZuoyeStatus.UNCOMMITTED.getType();
        } else if (3 == status) { // 未通过
            statusStr = ZuoyeStatus.FAIL.getType();
        } else if (4 == status) {
            statusStr = ZuoyeStatus.ADOPT.getType();
        }
        return workMapper.getWorkList(date, statusStr);
    }
}




