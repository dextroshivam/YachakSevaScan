//package com.yourname.yss.Controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/super-admin")
//@RequiredArgsConstructor
//public class SuperAdminController {
//
//    private final SuperAdminService superAdminService;
//
//    @PreAuthorize("hasRole('SUPER_ADMIN')")
//    @GetMapping("/overview")
//    public String getSuperAdminOverview() {
//        // SuperAdmin-specific logic
//        return "Super Admin Overview";
//    }
//
//    // Add more endpoints as needed
//}
