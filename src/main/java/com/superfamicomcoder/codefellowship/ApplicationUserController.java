package com.superfamicomcoder.codefellowship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ApplicationUserController {
    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    public RedirectView createUser(String username,
                                   String password,
                                   String firstName,
                                   String lastName,
                                   String dateOfBirth,
                                   String bio) {
        ApplicationUser newUser = new ApplicationUser(
                username,
                passwordEncoder.encode(password),
                firstName,
                lastName,
                dateOfBirth,
                bio);

        applicationUserRepository.save(newUser);

        Authentication authentication = new UsernamePasswordAuthenticationToken(newUser, null, new ArrayList<>());

        SecurityContextHolder.getContext().setAuthentication(authentication);


        return new RedirectView(("/profile"));
    }


    @GetMapping("/profile")
    public String getProfile(Principal p, Model m) {
        ApplicationUser user = applicationUserRepository.findByUsername(p.getName());

        m.addAttribute("user", user);
        m.addAttribute("currentUser", p);

        return "profile";
    }


    @GetMapping("/users")
    public String getAllUsers(Principal p, Model m) {
        List<ApplicationUser> users = (List) applicationUserRepository.findAll();

        m.addAttribute("users", users);

        return "users";
    }
}
