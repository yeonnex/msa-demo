package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/first-service")
public class MyController {
    @GetMapping("/message")
    public String hello(@RequestHeader("first-request") String header) {
        log.info("header from API Gateway" + header);
        return "Hello from first-service";
    }
}
