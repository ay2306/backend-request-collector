package com.brc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorld {
    @GetMapping("/")
    public String printHelloWorld(){
        return "HELLO WORLD";
    }
}

