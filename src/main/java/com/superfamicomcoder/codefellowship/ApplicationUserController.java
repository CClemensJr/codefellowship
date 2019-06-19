package com.superfamicomcoder.codefellowship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Date;

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
                                   java.sql.Date dateOfBirth,
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

        // TODO: Change redirect to profile page.
        return new RedirectView(("/"));
    }

}
