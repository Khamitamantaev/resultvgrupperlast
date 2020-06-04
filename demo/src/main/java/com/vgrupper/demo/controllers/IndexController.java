package com.vgrupper.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
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
