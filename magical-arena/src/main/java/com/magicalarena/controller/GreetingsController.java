package com.magicalarena.controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000") 
public class GreetingsController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Magical Arena!";
    }
}
