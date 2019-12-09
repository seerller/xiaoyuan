package com.xiaoyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan(value = "com.xiaoyuan.mapper")
public class XiaoyuanSpringbootApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(XiaoyuanSpringbootApplication.class, args);
    }
}
