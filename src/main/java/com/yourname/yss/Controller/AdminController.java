//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Service.AdminService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/admin")
//@RequiredArgsConstructor
//public class AdminController {
//
//    private final AdminService adminService;
//
//    @PreAuthorize("hasRole('ADMIN')")
//    @GetMapping("/dashboard")
//    public String getAdminDashboard() {
//        // Admin-specific logic
//        return "Admin Dashboard";
//    }
//
//    // Add more endpoints as needed
//}
