package com.yourname.yss.Config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        System.out.println("Point 1 reported");
        String role = authentication.getAuthorities().iterator().next().getAuthority();
        switch (role) {
            case "ROLE_DONOR":
                response.sendRedirect("/donor/dashboard");
                break;
            case "ROLE_YACHAK":
                response.sendRedirect("/yachak/dashboard");
                break;
            case "ROLE_ADMIN":
                response.sendRedirect("/admin/dashboard");
                break;
            case "SUPER_ADMIN":
                response.sendRedirect("/superadmin/dashboard");
                break;
            default:
                response.sendRedirect("/public/home");
                break;
        }
    }
}
