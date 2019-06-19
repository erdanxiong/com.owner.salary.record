package com.owner.salary.record.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CurrentSystemAgrument {

    public CurrentSystemAgrument(ApplicationArguments applicationArguments){
        List<String> nonOptionArgs = applicationArguments.getNonOptionArgs();
        for(String str:nonOptionArgs){
            System.out.println(str);
        }
    }
}
