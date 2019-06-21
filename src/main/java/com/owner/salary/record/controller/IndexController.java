package com.owner.salary.record.controller;

import com.owner.salary.record.pojo.SystemAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    SystemAttribute systemAttribute ;

    @RequestMapping("/index")
    public String index(){
        String index ="version:"+systemAttribute.getVersion()+"   description:"+systemAttribute.getDescription();
        return index ;
    }
}
