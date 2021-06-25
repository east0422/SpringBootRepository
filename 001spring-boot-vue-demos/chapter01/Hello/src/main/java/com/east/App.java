package com.east;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
// 开启自动化配置
 @EnableAutoConfiguration
 // 包扫描
 @ComponentScan

 // 组合注解@SpringBootApplication代替@EnableAutoConfiguration和 @ComponentScan
// @SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
