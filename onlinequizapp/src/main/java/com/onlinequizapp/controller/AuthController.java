package com.onlinequizapp.controller;

import com.onlinequizapp.dto.LoginRequest;
import com.onlinequizapp.dto.RegisterRequest;
import com.onlinequizapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest registerRequest) {
        String response = authService.register(registerRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
        String response = authService.login(loginRequest);
        return ResponseEntity.ok(response);
    }
}
