package com.aliyagiztar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    // http://localhost:9090
    @GetMapping
    public String hello() {
        return "INFO:AuthService :Hello World!";
    }
    // http://localhost:9090/info
    @GetMapping("/info")
    public String info() {
        return "INFO:AuthService :Hello World!";
    }
}
