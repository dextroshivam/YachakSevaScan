package com.yourname.yss.Controller.LoginControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class YachakLoginController {


    @GetMapping("/yachak")
    public String redirectTologinYachak() {
        return "login/login_yachak";
    }
}
