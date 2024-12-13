package com.onlinequizapp.util;

import java.util.regex.Pattern;

public class ValidationUtils {

    // Validates if the provided email is in a valid format
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    // Validates if the provided username meets basic criteria (e.g., alphanumeric, length)
    public static boolean isValidUsername(String username) {
        String usernameRegex = "^[a-zA-Z0-9]{3,20}$"; // Alphanumeric, between 3 and 20 characters
        return username != null && Pattern.matches(usernameRegex, username);
    }

    // Validates if the provided password meets basic security criteria
    public static boolean isValidPassword(String password) {
        // Password must be at least 8 characters long, contain one uppercase letter, one lowercase letter, one number, and one special character
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return password != null && Pattern.matches(passwordRegex, password);
    }
}
