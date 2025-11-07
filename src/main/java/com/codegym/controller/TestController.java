package com.codegym.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    //dụng
    @GetMapping("/get")
    public String get() {
        return "test";
    }

    //duy123
    @GetMapping("/get")
    public String getHome() {
        return "test";
    }
}
