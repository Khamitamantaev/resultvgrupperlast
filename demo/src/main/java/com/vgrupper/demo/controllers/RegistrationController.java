package com.vgrupper.demo.controllers;

import com.vgrupper.demo.entities.User;
import com.vgrupper.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Objects;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/registration")
    public String displayRegistration(){
        return "registration";
    }

    @PostMapping("/registration")
    public View registerUser(@RequestParam("username") String username, @RequestParam("password")String password,
                             @RequestParam("introduction") String introduction, HttpServletRequest request) {
        String contextPath = request.getContextPath();
        User user = new User();
        if (userRepository.getUserByUsername(username) == null) {
            user.setUsername(username);
            // I know that it can be blank field, but I did it on purpose to find out about Optionals:
            if (Objects.equals(introduction, ""))
                user.setIntroduction(null);
            else
                user.setIntroduction(introduction);
            user.setPassword(password);
            user.setCreatedDate(LocalDateTime.now());
            userRepository.save(user);
            return new RedirectView(contextPath + "/login");
        } else
            return new RedirectView(contextPath + "/registration");
    }
    }

