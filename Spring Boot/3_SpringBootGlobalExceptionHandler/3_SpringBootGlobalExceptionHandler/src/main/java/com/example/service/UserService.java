package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.exception.AgeNotFoundException;
import com.example.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String saveUser(User user) {

        if(user.getAge() < 18) {
            throw new AgeNotFoundException("Age should be greater than 18");
        }

        userRepository.save(user);

        return "User Saved Successfully";
    }
}
