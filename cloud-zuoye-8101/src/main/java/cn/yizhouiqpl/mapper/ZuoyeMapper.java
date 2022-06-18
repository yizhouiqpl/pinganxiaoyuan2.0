package cn.yizhouiqpl.mapper;

import cn.yizhouiqpl.entity.Zuoye;
import cn.yizhouiqpl.entity.ZuoyeNotify;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity cn.yizhouiqpl.entity.Zuoye
 */
public interface ZuoyeMapper extends BaseMapper<Zuoye> {

    List<ZuoyeNotify> notifyList(@Param("sId") int sId, @Param("date") String date);
}




