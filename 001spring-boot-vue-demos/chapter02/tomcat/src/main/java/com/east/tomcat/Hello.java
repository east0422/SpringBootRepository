package com.east.tomcat;

/**
 * @Author: east
 * @Date: 2021/6/28 11:16
 * @Description:
 */

import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "hello spring boot tomcat " + simpleDateFormat.format(new Date());
    }
}
