package com.sangeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.sangeng.domain.mapper")
public class SGBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(SGBlogApplication.class, args);
    }
}
