package com.superfamicomcoder.codefellowship;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    // Updated based on answer at https://stackoverflow.com/questions/42206998/spring-security-405-request-method-post-not-supported
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView getLoginPage(Model model, String error, String logout) { return new ModelAndView("login"); }
}
