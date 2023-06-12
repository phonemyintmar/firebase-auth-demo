//package com.pm.firebase.firebase.auth.demo.interceptor;
//
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseAuthException;
//import com.google.firebase.auth.FirebaseToken;
//import lombok.extern.slf4j.Slf4j;
//import org.aopalliance.intercept.MethodInterceptor;
//import org.aopalliance.intercept.MethodInvocation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//import java.nio.file.AccessDeniedException;
//
//@Slf4j
//public class CustomAuthorizationMethodInterceptor implements MethodInterceptor {
//
//
//    public CustomAuthorizationMethodInterceptor( ) {
//        log.info("COnstructed");
//    }
//
//    @Autowired
//    FirebaseAuth firebaseAuth;
//
//    @Override
//    public Object invoke(MethodInvocation invocation) throws Throwable {
//        CustomAuthorization annotation = invocation.getMethod().getAnnotation(CustomAuthorization.class);
//        String parameterValue = annotation.parameterValue();
//
//        Object[] methodArgs = invocation.getArguments();
////        HttpServletRequest request = (HttpServletRequest) methodArgs[0];
//        String token = (String) methodArgs[0];
//        token = token.split(" ")[1];
//        if (customAuthorizationCheck(token)) {
//            // Proceed with the method execution
//            return invocation.proceed();
//        } else {
//            throw new AccessDeniedException("You don't have permission to access this method.");
//        }
//    }
//
//    private boolean customAuthorizationCheck(String token) {
//        try {
//            FirebaseToken firebaseToken = firebaseAuth.verifyIdToken(token);
//            log.info("Passed for token");
//            return true;
//        } catch (FirebaseAuthException ex) {
//            log.error("Wrong Token. Cause => {}", ex.getMessage());
//            return false;
//        }
//    }
//}
