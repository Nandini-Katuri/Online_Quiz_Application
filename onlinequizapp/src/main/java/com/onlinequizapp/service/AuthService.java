package com.onlinequizapp.service;

import com.onlinequizapp.entity.User;
import com.onlinequizapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;

    @Autowired
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        // Logic to register a new user (e.g., validate data, hash password)
        return userRepository.save(user);
    }

    public Optional<User> loginUser(String username, String password) {
        // Logic to check user credentials (e.g., password hashing and validation)
        return userRepository.findByUsername(username)
                .filter(user -> user.getPassword().equals(password)); // Example, implement actual password hashing
    }

    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
