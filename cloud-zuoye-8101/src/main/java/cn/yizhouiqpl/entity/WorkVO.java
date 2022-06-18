package cn.yizhouiqpl.entity;

import lombok.Data;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/15/23:46
 */
// 学生完成作业的情况
@Data
public class WorkVO extends Work {

    private String sName;
    private String subName;

}
