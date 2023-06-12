package com.springrestdb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> saveUsers(@RequestBody List<User> user){
        return userService.saveUsers(user);
    }

    @GetMapping("/getUserDetails")
    public List<User> getUserDetails(){
        return userService.getUserDetails();
    }
}
