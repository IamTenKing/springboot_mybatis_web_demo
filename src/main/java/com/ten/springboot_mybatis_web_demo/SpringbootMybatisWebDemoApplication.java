package com.ten.springboot_mybatis_web_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.ten.springboot_mybatis_web_demo.mapper")
public class SpringbootMybatisWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisWebDemoApplication.class, args);
    }

}

