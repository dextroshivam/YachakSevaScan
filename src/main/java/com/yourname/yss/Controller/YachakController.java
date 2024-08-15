//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.Yachak;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/yachaks")
//@RequiredArgsConstructor
//public class YachakController {
//
//    private final YachakService yachakService;
//
//    @PreAuthorize("hasRole('YACHAK')")
//    @GetMapping("/profile")
//    public Yachak getYachakProfile(@RequestParam Long yachakId) {
//        return yachakService.getYachakById(yachakId);
//    }
//
//    // Add more endpoints as needed
//}
