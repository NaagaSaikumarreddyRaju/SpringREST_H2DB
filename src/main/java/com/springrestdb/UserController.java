package com.springrestdb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
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

    @DeleteMapping("/delUserDetailsById/{id}")
    public String delUserDetailsById(@PathVariable("id") Long id){
        userService.delUserDetailsById(id);
        return "Data Deleted Succesfully";
    }

    @PutMapping("/updateUserDetailsById/{id}")
    public User updateUserDetailsById( @PathVariable("id") Long id, @RequestBody User user){
        return userService.updateUserDetailsById(id,user);
    }
}
