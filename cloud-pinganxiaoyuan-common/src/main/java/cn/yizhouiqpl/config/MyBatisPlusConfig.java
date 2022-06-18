package cn.yizhouiqpl.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/13/22:22
 */
@Configuration
@MapperScan("cn.yizhouiqpl.mapper")
public class MyBatisPlusConfig {
}
