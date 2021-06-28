package com.east;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
// 开启自动化配置
 @EnableAutoConfiguration
 // 包扫描
 @ComponentScan

 @RestController

 // 组合注解@SpringBootApplication代替@EnableAutoConfiguration和 @ComponentScan
// @SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(App.class);
        builder.bannerMode(Banner.Mode.CONSOLE).run(args);

//        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello Spring boot!";
    }
}
