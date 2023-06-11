package com.pm.firebase.firebase.auth.demo.service.implementation;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.pm.firebase.firebase.auth.demo.service.ITestAuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestAuthService implements ITestAuthService {

    private final FirebaseAuth firebaseAuth;

    public TestAuthService(FirebaseAuth firebaseAuth) {
        this.firebaseAuth = firebaseAuth;
    }

    @Override
    public ResponseEntity<?> createUser() {
        return null;
    }

    public ResponseEntity<?> getUserById(String id) throws FirebaseAuthException {
        UserRecord userRecord = firebaseAuth.getUser(id);
        userRecord.getUid();
        userRecord.getDisplayName();
        return null;
    }


}
