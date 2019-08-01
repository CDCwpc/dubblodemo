package com.example.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.example.dao.mapper")
public class DaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class, args);
    }

}
