package com.bfrancisdev.backend.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {
    
    @GetMapping
    public String hello() {
        return String.format("Olá Mundo Java %s", new Date());
    }

}
