package com.ict.edu3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        return "New, World!";
    }

    @GetMapping("/hi")
    public String hi() {
        return "hi, World!";
    }
}