package com.linshenlu.hello.controller;

import com.linshenlu.hello.config.PropertyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wen
 * @create 2020/7/26 0:13
 */
@RestController
public class Hello {

    @Autowired
    private PropertyBean propertyBean;

/*    @Value("${dream.text}")
    private String text;*/


    @RequestMapping("/say")
    public String hello(){

        return "我爱你，" + propertyBean.getName();
    }
/*
    @GetMapping("/dream")
    public String dream(){
        return text;
    }*/
}
