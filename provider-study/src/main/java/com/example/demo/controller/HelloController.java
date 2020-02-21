package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${myName}")
    private String myName;

    @RequestMapping("/hello")
    public String hello() {
        return "hello " + myName;
    }

}
