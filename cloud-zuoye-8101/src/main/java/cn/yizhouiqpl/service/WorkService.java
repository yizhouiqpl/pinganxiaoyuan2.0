package cn.yizhouiqpl.service;

import cn.yizhouiqpl.entity.Work;
import cn.yizhouiqpl.entity.WorkVO;
import cn.yizhouiqpl.entity.Zuoye;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface WorkService extends IService<Work> {

    void checkWork(Zuoye overdueZuoye);

    List<WorkVO> getWorkList(String date, int status);
}
