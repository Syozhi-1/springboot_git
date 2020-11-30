package com.entor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    public int port;

    @GetMapping("/getPort")
    public int getPort(){
        return port;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/sb")
    public String sb(){
        return "sb   ";
    }
    @RequestMapping("/马保国")
    public String mabaoguo(){
        return "年轻人不讲武德";
    }
}
