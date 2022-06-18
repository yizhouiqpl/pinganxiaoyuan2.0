package cn.yizhouiqpl.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/15/0:10
 */
@Data
public class ZuoyeNotify {

    private Integer zId; // 作业id
    private String sName; // 学生姓名
    private String cName; // 班级
    private String uName; // 老师姓名
    private String subName; // 科目名
    private String zDesc; // 作业内容
    private String zFile; // 老师发布作业文件
    private String wFile; // 学生提交作业文件
    private Date zCreatetime; // 作业发布时间
    private Date wSubtime; // 作业发布时间
    private Date wAudtime; // 作业审批时间
    private String wStatus; // 作业状态
    private String wComment; // 作业评语

}
