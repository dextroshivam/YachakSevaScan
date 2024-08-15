//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.Yachak;
//import com.yourname.yss.Service.AdminManagementService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/admin/management")
//@RequiredArgsConstructor
//public class AdminManagementController {
//
//    private final AdminManagementService adminManagementService;
//
//    @PreAuthorize("hasRole('ADMIN')")
//    @GetMapping("/yachaks/{id}")
//    public Yachak getYachak(@PathVariable Long id) {
//        return adminManagementService.getYachakById(id);
//    }
//
//    @PreAuthorize("hasRole('ADMIN')")
//    @PutMapping("/yachaks/{id}")
//    public Yachak updateYachak(@PathVariable Long id, @RequestBody YachakUpdateRequest request) {
//        return adminManagementService.updateYachak(id, request);
//    }
//
//    // Similar methods for managing donors
//}
