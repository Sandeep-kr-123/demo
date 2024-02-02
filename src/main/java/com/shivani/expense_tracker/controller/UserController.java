package com.shivani.expense_tracker.controller;

import com.shivani.expense_tracker.model.User;
import com.shivani.expense_tracker.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }


    @PostMapping
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        return userService.deleteUser(userId);
    }
}
