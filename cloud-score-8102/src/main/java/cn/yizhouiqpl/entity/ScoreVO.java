package cn.yizhouiqpl.entity;

import lombok.Data;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/16/19:23
 */
@Data
public class ScoreVO extends Score {

    private int sId;
    private String sName;
    private String cName;
    private String eName;
    private Double scAvg;

}
