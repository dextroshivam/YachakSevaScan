package com.yourname.yss.Controller.IndexControllers;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Controller
@RequestMapping("/public")
public class ContactController {

    @GetMapping("/contact")
    public String contact() {
        return "Index/contact";
    }
}
