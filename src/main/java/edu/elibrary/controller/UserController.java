package edu.elibrary.controller;

import edu.elibrary.model.User;
import edu.elibrary.repository.UserRepository;
import edu.elibrary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/register", consumes = "application/json", produces = "application/json")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        return userService.loginUser(user.getUsername());
    }

    @GetMapping(value="/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}