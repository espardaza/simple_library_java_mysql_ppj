package com.project.library.controller;

import com.project.library.entity.User;
import com.project.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // API to retrieve a list of users (for viewing in a browser)
    @GetMapping
    public java.util.List<User> getAllUsers() {
        return userRepository.findAll();
    }
    // ---------------------

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}