package cn.yizhouiqpl.task;

import cn.yizhouiqpl.entity.Zuoye;
import cn.yizhouiqpl.service.WorkService;
import cn.yizhouiqpl.service.ZuoyeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/15/21:03
 */
@Component
@Slf4j
public class ZuoyeTask {

    @Resource
    private ZuoyeService zuoyeService;

    @Resource
    private WorkService workService;

    // 检查作业的完成情况，根据 zuoye 表中的记录对查询出该班级中的学生
    // 根据 work 表的完成情况对该班级学生进行修改，若已提交则不需要再添加
    // 若未提交则需要将学生的作业完成情况插入到 work 表中
    // 测试，从 0 秒开始每 30 秒执行一次
//    @Scheduled(cron = "0/3 * * * * ?")
    // 每天凌晨 0 点执行一次
    @Scheduled(cron = "0 0 0 * * ?")
    public void confirmZuoyeCompletion() {
        log.info("检查作业完成情况");

        // 查询出过期的 zuoye
        QueryWrapper<Zuoye> wrapper = new QueryWrapper<>();
        wrapper.le("z_deadline", new Date());
        List<Zuoye> overdueZuoyeList = zuoyeService.list(wrapper);

        overdueZuoyeList.forEach(overdueZuoye -> workService.checkWork(overdueZuoye));

    }

}
