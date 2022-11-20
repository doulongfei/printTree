package com.dou.tree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dou.tree.mapper")
public class PrintTreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrintTreeApplication.class, args);
    }

}
