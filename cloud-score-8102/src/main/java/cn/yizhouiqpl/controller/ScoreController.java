package cn.yizhouiqpl.controller;

import cn.yizhouiqpl.back.R;
import cn.yizhouiqpl.entity.ScoreVO;
import cn.yizhouiqpl.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/17/20:18
 */
@RestController
@RequestMapping("score")
@Slf4j
public class ScoreController {

    @Resource
    private ScoreService scoreService;


    @GetMapping("getAll/{eId}/{cId}")
    public R getAllScoreByEIdandCId(@PathVariable int eId, @PathVariable int cId) {
        log.info("获得该班级全部的成绩");

        Map<String, Object> allScore = scoreService.getAllScoreByEIdandCId(eId, cId);
        return R.ok().setCode(200).setMessage("查询成功").setData(allScore);
    }

    @GetMapping("getTotalScore/{eId}/{cId}")
    public R totalScore(@PathVariable int eId, @PathVariable int cId) {
        log.info("查询总分");
        List<ScoreVO> scoreVOS = scoreService.getTotalScore(eId, cId);
        return R.ok().data("totalScore", scoreVOS);
    }

    @GetMapping("getAssignedGrade/{subject}")
    public R getAssignedGrade(@PathVariable String subject) {
        log.info("查询指定科目的分数");
        List<ScoreVO> assignedGrade = scoreService.getAssignedGrade(subject);
        return R.ok().data("score", assignedGrade);
    }



}
