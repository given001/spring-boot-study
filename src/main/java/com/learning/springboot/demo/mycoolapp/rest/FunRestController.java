package com.learning.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose new end point for "work out"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run 5k";
    }

    // expose new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "You are lucky today !!!";
    }

}
