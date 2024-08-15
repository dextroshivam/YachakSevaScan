//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.Donor;
//import com.yourname.yss.Service.DonorService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/donors")
//@RequiredArgsConstructor
//public class DonorController {
//
//    private final DonorService donorService;
//
//    @PreAuthorize("hasRole('DONOR')")
//    @GetMapping("/profile")
//    public Donor getDonorProfile(@RequestParam Long donorId) {
//        return donorService.getDonorById(donorId);
//    }
//
//    // Add more endpoints as needed
//}
