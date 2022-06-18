package cn.yizhouiqpl.enums.zuoye;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/15/0:29
 */
@AllArgsConstructor
@Getter
public enum ZuoyeStatus {

    FAIL("未通过"),

    ADOPT("通过"),

    UNCOMMITTED("未提交"),

    UNCORRECTED("待审批");

    private final String type;

}
