package com.org.app.poc.itcares.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloService {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello Service";
    }

}