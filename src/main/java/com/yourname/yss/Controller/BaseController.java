package com.yourname.yss.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

//@RestController
@Controller
public class BaseController {

    //    @GetMapping("/public/register")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new UserRequestDTO());
//        return "register"; // This will load the register.html page
//    }
//
//    @PostMapping("/public/register")
//    public String registerUser(UserRequestDTO userRequestDto) {
//        // Handle registration logic here
//        return "redirect:/public/login"; // Redirect to login after successful registration
//    }
//    @GetMapping("/")
//    public RedirectView index() {
//        return new RedirectView("/home");
//    }
    @RequestMapping("/")
    public RedirectView index() {
        return new RedirectView("/home");
    }
}
