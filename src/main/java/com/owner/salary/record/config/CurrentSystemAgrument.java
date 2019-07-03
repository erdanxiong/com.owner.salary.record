package com.owner.salary.record.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CurrentSystemAgrument {

    public CurrentSystemAgrument(ApplicationArguments applicationArguments){
        boolean debug = applicationArguments.containsOption("debug");
        List<String> files = applicationArguments.getNonOptionArgs();
        for(String str:files){
            System.out.println(str);
        }
    }
}
