package com.vgrupper.demo.service;

import com.vgrupper.demo.entities.User;
import com.vgrupper.demo.web.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
