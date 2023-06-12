package com.pm.firebase.firebase.auth.demo.controller;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin
@RequestMapping("firebase/auth/")
public class TestController {
    @Autowired
    FirebaseAuth firebaseAuth;

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
    public ResponseEntity<?> greetAuthenticated(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) throws FirebaseAuthException {
        System.out.println(token);
        firebaseAuth.verifyIdToken(token.split(" ")[1]);
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
