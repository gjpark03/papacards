package com.example.team10.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class SignUpController {
//
//    @Autowired
//    private SignUpService signUpService;
//
//
//    // How can I write a signup servlet with Springboot and Java? prompt (11 lines). ChatGPT, 26 Nov. version OpenAI, 26 Nov. 2023, chat.openai.com/chat.
//    @PostMapping(/"signup")
//    public String register(@ModelAttribute User user, HttpServletResponse response) {
//        boolean userCreated = userService.createUser(user);
//        if (userCreated) {
//            return "redirect:/login"; // redirect to login page after successful registration
//        } else {
//            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // Set error status
//            return "redirect:/signup"; // redirect back to sign-up in case of failure
//        }
//    }
}