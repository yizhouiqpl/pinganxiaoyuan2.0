package cn.yizhouiqpl.mapper;

import cn.yizhouiqpl.entity.Work;
import cn.yizhouiqpl.entity.WorkVO;
import cn.yizhouiqpl.entity.ZuoyeNotify;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity cn.yizhouiqpl.entity.Work
 */
public interface WorkMapper extends BaseMapper<Work> {

    List<ZuoyeNotify> notifyList(@Param("sId") int sId, @Param("date") String date);

    List<Integer> getSidByZid(Integer zId);

    List<WorkVO> getWorkList(@Param("date") String date, @Param("status") String statusStr);
}




