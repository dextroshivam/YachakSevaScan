package com.yourname.yss.Controller.RegistrationControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class AdminRegistrationController {
    @GetMapping("/admin")
    public String registerAdmin() {
        return "register_admin";
    }
}
