package com.example.homework11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    @GetMapping(path = "/name")
    public String name(){
        return"My name is Feras";
    }

    @GetMapping(path = "/age")
    public String age(){
        return"My age is 22";
    }

    @GetMapping(path = "/check/status")
    public String check(){
        return"Everything OK";
    }

    @GetMapping(path = "/health")
    public String health(){
        return"Server health is up and running";
    }

    @GetMapping(path = "/names")
    public String[] names(){
        String[] names = {"Ahmed","khalid","Abdullah","Feras"};
        return names;
    }




}
