package com.yourname.yss.Controller.IndexControllers;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Controller
@RequestMapping("/public")
public class AboutController {

    @GetMapping("/about")
    public String about() {
        return "Index/about";
    }
}
