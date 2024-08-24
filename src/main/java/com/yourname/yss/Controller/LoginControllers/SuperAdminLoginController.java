package com.yourname.yss.Controller.LoginControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class SuperAdminLoginController {
    @GetMapping("/superadmin")
    public String loginSuperAdmin() {
        return "login_superadmin";
    }
}
