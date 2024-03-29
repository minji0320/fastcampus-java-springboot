package com.example.interceptor.controller;

import com.example.interceptor.annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
@Slf4j
@Auth
public class PrivateController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("private hello controller - {}", name);
        return "private hello";
    }
}
