package com.ms.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    @Transactional
    public UserModel saveUser(UserModel userModel){
        return this.userRepository.save(userModel);
    }
}
