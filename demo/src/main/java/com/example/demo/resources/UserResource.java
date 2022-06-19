package com.example.demo.resources;

import com.example.demo.domains.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping("users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("users")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping("users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

}
