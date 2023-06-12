package com.pm.firebase.firebase.auth.demo.interceptor;

import com.google.firebase.auth.FirebaseAuth;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Configuration
public class CustomAuthorizationInterceptor implements HandlerInterceptor {

    @Autowired
    FirebaseAuth firebaseAuth;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            CustomAuthorization annotation = handlerMethod.getMethod().getAnnotation(CustomAuthorization.class);
            log.info("D a hti tok yout tl");
            if (annotation != null) {
                String parameterValue = annotation.parameterValue();
                log.info("D ko yout tl aye say pl");
                // Retrieve the request parameter

                if (true) {
                    // Proceed with the request execution
                    return true;
                } else {
                    // Unauthorized access
                    response.sendError(HttpServletResponse.SC_FORBIDDEN, "You don't have permission to access this resource.");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // No post-handle logic required
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // No after-completion logic required
    }
}