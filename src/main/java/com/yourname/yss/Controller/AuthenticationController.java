//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.User;
//import com.yourname.yss.Service.AuthenticationService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/auth")
//@RequiredArgsConstructor
//public class AuthenticationController {
//
//    private final AuthenticationService authService;
//
//    @PostMapping("/register")
//    public User registerUser(@RequestBody UserRegistrationRequest request) {
//        return authService.registerUser(request);
//    }
//
//    @PostMapping("/login")
//    public String loginUser(@RequestBody LoginRequest request) {
//        return authService.authenticateUser(request);
//    }
//
//    @PutMapping("/profile")
//    public User updateProfile(@RequestBody UserUpdateRequest request) {
//        return authService.updateUserProfile(request);
//    }
//}
