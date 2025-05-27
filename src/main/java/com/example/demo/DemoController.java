package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/melissa")
    public String hello() {
        return "A Melissa passou por aqui :)";
    }
}
