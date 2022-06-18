package cn.yizhouiqpl.service.impl;

import cn.yizhouiqpl.entity.ScoreVO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yizhouiqpl.entity.Score;
import cn.yizhouiqpl.service.ScoreService;
import cn.yizhouiqpl.mapper.ScoreMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score>
    implements ScoreService{

    @Resource
    private ScoreMapper scoreMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> getAllScoreByEIdandCId(int eId, int cId) {
        Map<String, Object> map = new HashMap<>();
        // 求各科平均分
        ScoreVO avgScore = scoreMapper.getAverageScore(eId, cId);

        // 求各个学生的成绩
        List<ScoreVO> scoreVOS = scoreMapper.getScoreByCId(eId, cId);
        map.put("avgScore", avgScore);
        map.put("scoreVOS", scoreVOS);
        return map;
    }

    @Override
    public List<ScoreVO> getTotalScore(int eId, int cId) {
        return scoreMapper.getTotalScore(eId, cId);
    }

    @Override
    public List<ScoreVO> getAssignedGrade(String subject) {
        return scoreMapper.getAssignedGrade(subject);
    }
}




