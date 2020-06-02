package com.vgrupper.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String displayIndex(){
        return "index";
    }
    @GetMapping("/features")
    public String displayFeatures(){
        return "features";
    }
    @GetMapping("/pricing")
    public String displayPrice(){
        return "pricing";
    }
    @GetMapping("/about")
    public String displayAbout(){
        return "about";
    }
    @GetMapping("/contacts")
    public String displayContact(){
        return "contacts";
    }
}
