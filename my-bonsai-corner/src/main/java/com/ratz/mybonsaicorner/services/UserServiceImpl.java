package com.ratz.mybonsaicorner.services;

import com.ratz.mybonsaicorner.entities.User;
import com.ratz.mybonsaicorner.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        this.userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

}
