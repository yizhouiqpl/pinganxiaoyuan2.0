package cn.yizhouiqpl.service;

import cn.yizhouiqpl.entity.Zuoye;
import cn.yizhouiqpl.entity.ZuoyeNotify;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface ZuoyeService extends IService<Zuoye> {

    List<ZuoyeNotify> notifyList(int sId, String date);
}
