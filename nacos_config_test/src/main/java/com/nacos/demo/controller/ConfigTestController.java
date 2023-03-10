package com.nacos.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigTestController {

    @Value("${user.localName:}")
    private String name;
    @Value("${user.age:}")
    private String age;
    @Value("${mysql1.test}")
    private String mysql;
    @Value("${crm.test}")
    private String crm;
    @GetMapping("/test")
    public String getConfig(){
        return name + ":" + age + ":" + crm + ":" + mysql;
    }
}
