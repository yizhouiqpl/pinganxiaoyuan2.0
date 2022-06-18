package cn.yizhouiqpl.service.impl;

import cn.yizhouiqpl.entity.Zuoye;
import cn.yizhouiqpl.entity.ZuoyeNotify;
import cn.yizhouiqpl.mapper.WorkMapper;
import cn.yizhouiqpl.mapper.ZuoyeMapper;
import cn.yizhouiqpl.service.ZuoyeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class ZuoyeServiceImpl extends ServiceImpl<ZuoyeMapper, Zuoye>
    implements ZuoyeService{

    @Resource
    private ZuoyeMapper zuoyeMapper;

    @Resource
    private WorkMapper workMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<ZuoyeNotify> notifyList(int sId, String date) {
        List<ZuoyeNotify> notifies = new ArrayList<>();
        List<ZuoyeNotify> zuoyeNotifies = zuoyeMapper.notifyList(sId, date); // 查询发布作业通知
        List<ZuoyeNotify> workNotifies = workMapper.notifyList(sId, date); // 查询提交作业通知
        notifies.addAll(zuoyeNotifies);
        notifies.addAll(workNotifies);
        // 对老师发布的作业通知和学生提交的作业通知进行遍历，去除重复的 作业通知
        // 重复的作业：当老师发布的作业学生提交后，只需显示提交的作业通知，发布的作业通知就不用在重复显示了
        for (int i = 0; i < notifies.size() - 1; i++) {
            ZuoyeNotify zuoyeNotify1 = notifies.get(i);
            for (int j = i + 1; j < notifies.size(); j++) {
                ZuoyeNotify zuoyeNotify2 = notifies.get(j);
                // 若存在相同的 zId 说明两个作业通知相同，去除掉没有 完成状态的 作业通知即可
                if (zuoyeNotify1.getZId() == zuoyeNotify2.getZId()) {
                    // 若学生存在提交操作，则 work 的状态一定不为 null
                    if (null == zuoyeNotify1.getWStatus()) {
                        notifies.remove(zuoyeNotify1);
                    } else {
                        notifies.remove(zuoyeNotify2);
                    }
                    i --;
                    break;
                }
            }
        }
        return notifies;
    }
}




