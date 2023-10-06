package com.userpassword.userpassword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.userpassword.userpassword.model.user;
import com.userpassword.userpassword.repository.userrepo;

@Controller
@RequestMapping("/users")
public class usercontroller {
    @Autowired
    private userrepo userRepository;

    @PostMapping("/create")
    public user createUser(@RequestBody user user) {
        String password = generatePassword(user.getFirstName(), user.getMiddleName(), user.getLastName());
        user.setPassword(password);

        return userRepository.save(user);
    }

    private String generatePassword(String firstName, String middleName, String lastName) {
        return "generatedPassword123";
    }
}




