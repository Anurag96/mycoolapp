package com.luv2code.springboot.demo.mycoolapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class controller {

    @GetMapping("/")
    public String sayHello(){

        return "Hello Anurag! LocalTime on the server is "+ LocalDateTime.now();

    }

    @GetMapping("/workout")
    public String workOut()
    {
        return "work hard";

    }

    @GetMapping("/fortune")
    public String fortuneToday()
    {
        return "fortune";

    }
}
