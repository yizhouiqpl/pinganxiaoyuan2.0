package cn.yizhouiqpl.mapper;

import cn.yizhouiqpl.entity.Score;
import cn.yizhouiqpl.entity.ScoreVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity cn.yizhouiqpl.entity.Score
 */
public interface ScoreMapper extends BaseMapper<Score> {

    ScoreVO getAverageScore(@Param("eId") int eId, @Param("cId") int cId);

    List<ScoreVO> getScoreByCId(@Param("eId") int eId, @Param("cId") int cId);

    List<ScoreVO> getTotalScore(@Param("eId") int eId, @Param("cId") int cId);

    List<ScoreVO> getAssignedGrade(String subject);

}




