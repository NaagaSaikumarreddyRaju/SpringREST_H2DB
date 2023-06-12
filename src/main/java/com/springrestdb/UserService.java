package com.springrestdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User saveUser(User user) {
       return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> user) {
        return userRepository.saveAll(user);
    }

    public List<User> getUserDetails() {
        return userRepository.findAll();
    }
}
