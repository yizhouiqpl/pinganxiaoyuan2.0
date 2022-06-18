package cn.yizhouiqpl.enums.score;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/16/23:47
 */
@AllArgsConstructor
@Getter
public enum ExamType {

    FIRST_AUTUMN("第一次模拟/秋"),

    SECOND_AUTUMN("第二次模拟/秋"),

    END_OF_PERIOD_AUTUMN("上学期期末"),

    FIRST_SPRING("第一次模拟/春"),

    SECOND_SPRING("第二次模拟/春"),

    END_OF_PERIOD_SPRING("下学期末");

    private final String type;
}
