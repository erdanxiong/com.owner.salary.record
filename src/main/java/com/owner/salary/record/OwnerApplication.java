package com.owner.salary.record;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.owner.salary.record.mapper")
@SpringBootApplication
public class OwnerApplication {
    public static void main(String [] args){
        SpringApplication.run(OwnerApplication.class,args);
    }
}
