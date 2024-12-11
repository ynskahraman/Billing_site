package com.example.billing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";  // Login sayfasına yönlendir
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";  // Signup sayfasına yönlendir
    }
}
    