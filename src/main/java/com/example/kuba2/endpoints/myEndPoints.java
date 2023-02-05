package com.example.kuba2.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//TODO do zrobienia
@RestController
public class myEndPoints {
    @GetMapping("/test")
    public String endpoint1(){
        return "test";
    }
}
