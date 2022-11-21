package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/second-service")
public class MyController {
    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header) {
        log.info("second-service Request Header: " + header);
        return "Hello From Second Service";
    }
}
