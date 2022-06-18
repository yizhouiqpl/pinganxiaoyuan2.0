package cn.yizhouiqpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/13/17:36
 */
@SpringBootApplication
@EnableScheduling // 开启定时任务
public class ZuoYeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuoYeApplication.class, args);
    }
}
