package com.superfamicomcoder.codefellowship;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StaticController {

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("signup")
    public String getSignupPage() {
        return "signup";
    }

    // Updated based on example https://hellokoding.com
    @GetMapping("login")
    public String getLoginPage(Model model, String error, String logout) {
        if (error != null) model.addAttribute("error", "Your username and password is invalid.");
        if (logout != null) model.addAttribute("message", "You have been logged out successfully");

        return "profile";
    }
}
