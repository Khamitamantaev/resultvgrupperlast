package com.vgrupper.demo.controllers;

import groovy.lang.GrabExclude;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String displayRegistration(){
        return "registration";
    }
}
