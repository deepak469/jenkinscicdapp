package com.example.jenkins.cicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/v1")
public class DemoController {

    @RequestMapping("/test1")
    public String testone(){
        return "test1";
    }
}
