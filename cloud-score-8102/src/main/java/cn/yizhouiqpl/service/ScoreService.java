package cn.yizhouiqpl.service;

import cn.yizhouiqpl.entity.Score;
import cn.yizhouiqpl.entity.ScoreVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface ScoreService extends IService<Score> {

    Map<String, Object> getAllScoreByEIdandCId(int eId, int cId);

    List<ScoreVO> getTotalScore(int eId, int cId);

    List<ScoreVO> getAssignedGrade(String subject);

}
