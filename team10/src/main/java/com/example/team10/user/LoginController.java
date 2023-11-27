package com.example.team10.flashcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller 
public class LoginController {

    @Autowired
    private LoginValidation loginService;

    @GetMapping
    public String login() {
        return "Login";
    }

    @PostMapping 
    public String submitLogin(@RequestParam String username, @RequestParam String password) {
        if (loginService.validateLogin(username, password)) {
            return // redirect to the home page
        }
        else {
            return // redirect to the login page, invalid login
        }
    }
}