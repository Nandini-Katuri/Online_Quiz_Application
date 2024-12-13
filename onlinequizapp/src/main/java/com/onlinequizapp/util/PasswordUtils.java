package com.onlinequizapp.util;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Hashes a password using BCrypt
    public static String hashPassword(String password) {
        return passwordEncoder.encode(password);
    }

    // Validates a password against a hashed password
    public static boolean validatePassword(String password, String hashedPassword) {
        return passwordEncoder.matches(password, hashedPassword);
    }
}
