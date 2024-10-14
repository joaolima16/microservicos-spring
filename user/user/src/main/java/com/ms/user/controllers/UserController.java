package com.ms.user.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.controllers.dtos.USerRecordDTO;
import com.ms.user.models.UserModel;
import com.ms.user.services.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity saveUser(@RequestBody @Valid USerRecordDTO uSerRecordDTO) {
        var userModel = new UserModel();

        BeanUtils.copyProperties(uSerRecordDTO, userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(userModel));
    }
}
