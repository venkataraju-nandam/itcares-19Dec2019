package com.org.app.poc.itcares.resource;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Venkata.Nandam
 * Basic rest service to test URL response and a method of Cucumber Integration testing
 */
@Controller
public class HelloServiceAPI {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello Service";
    }
    
    @ResponseBody
    @GetMapping("/version")
    public String getVersion() {
        return "1.0";
    }
    
    /**
     * @param response
     * @return
     * Adding this rest method to for Cucumber Spring boot testing Integration
     */
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(HttpServletResponse response) {
        return "hello";
    }
    
    /**
     * @param response
     * @return
     * 
     * Spring boot - Cucumber Integration Test
     */
    @PostMapping("/post-test")
    public String sayHelloPost(HttpServletResponse response) {
        return "hello";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "/version1" })
    public String getVersion1() {
        return "1.0";
    }

}