package com.jackhu.consumer.study.controller;

import com.jackhu.consumer.study.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private ProviderClient providerClient;

    @RequestMapping("/hi")
    public String hello() {
        String hello = this.providerClient.hello();
        return "hi provider" + hello;
    }


}
