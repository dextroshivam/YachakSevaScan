package com.yourname.yss.Controller.IndexControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class TermsOfServicesController {
    @GetMapping("/terms")
    public String terms() {
        return "Index/termsOfServices";
    }
}
