package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final String USERNAME = "admin";
    private final String PASSWORD = "password";

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            model.addAttribute("message", "Logged in successfully!");
        } else {
            model.addAttribute("message", "Not logged in!");
        }
        return "login";
    }
}
