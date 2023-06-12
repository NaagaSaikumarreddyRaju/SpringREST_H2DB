package com.springrestdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void delUserDetailsById(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUserDetailsById(Long id,User user) {

       User olduser = userRepository.findById(id).get();

        olduser.setFirstName(user.getFirstName());
        olduser.setLastName(user.getLastName());
        olduser.setEmail(olduser.getEmail());

        return userRepository.save(olduser);
    }
}
