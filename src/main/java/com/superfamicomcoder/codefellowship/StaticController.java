package com.superfamicomcoder.codefellowship;

import org.springframework.stereotype.Controller;
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

    @GetMapping("login")
    public String getLoginPage() {
        return "login";
    }
}
