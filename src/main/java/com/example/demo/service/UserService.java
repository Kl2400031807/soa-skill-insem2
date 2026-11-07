package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return List.of(
            new User(1L, "Akshaya", "akshaya@gmail.com"),
            new User(2L, "Pavani", "pavani@gmail.com")
        );
    }
}
