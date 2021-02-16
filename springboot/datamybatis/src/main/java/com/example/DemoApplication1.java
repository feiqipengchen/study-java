package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan(value = "com.atguigu.springboot.mapper")
@SpringBootApplication
public class DemoApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication1.class, args);
    }

}
