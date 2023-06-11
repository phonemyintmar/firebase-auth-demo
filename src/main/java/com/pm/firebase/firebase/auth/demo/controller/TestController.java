package com.pm.firebase.firebase.auth.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("firebase/auth/")
public class TestController {

    @GetMapping("login")
    public ResponseEntity<?> login() {
        return null;
    }

    @GetMapping("user")
    public ResponseEntity<?> getUser(@RequestParam String id, @RequestParam String email) {
        if (!id.isBlank()) return null;
        if (!email.isBlank()) return null;
        return null;
    }

    @GetMapping("greet")
    public ResponseEntity<?> greet() {
        return ResponseEntity.ok("Hello, this is unauthenticated API");
    }

    @GetMapping("greet-authenticated")
    public ResponseEntity<?> greetAuthenticated() {
        return ResponseEntity.ok("Hello, this is authenticated API");
    }

    //get nae pl a yin sann ya ag
    @GetMapping("create")
    public ResponseEntity<?> createUser() {
        return null;
    }

    @GetMapping("update")
    public ResponseEntity<?> updateUser() {
        return null;
    }
}
