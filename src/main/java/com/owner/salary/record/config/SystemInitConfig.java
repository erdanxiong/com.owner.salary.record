package com.owner.salary.record.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SystemInitConfig   implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动的时候做一些监听操作");
    }
}
