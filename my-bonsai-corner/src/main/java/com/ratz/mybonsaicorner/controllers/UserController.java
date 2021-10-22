package com.ratz.mybonsaicorner.controllers;

import com.ratz.mybonsaicorner.entities.User;
import com.ratz.mybonsaicorner.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/user/new")
    public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {

        System.out.println(user.toString());
        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        User userToSave = new User(user.getUserName(),user.getFirstName(),user.getLastName(),user.getEmail(), encodedPassword, new ArrayList<>());

        userService.addUser(userToSave);

        return new ResponseEntity<>(userToSave, HttpStatus.CREATED);
    }

}
