package com.yourname.yss.Controller.LoginControllers;

import com.yourname.yss.DEC.LoginDEC;
import com.yourname.yss.Service.AdminService;
import com.yourname.yss.Service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/login")
public class AdminLoginController {
    @Autowired
    private AdminService adminService;
//    @Autowired
//    DonorLoginDEC donorLoginDEC;

    @GetMapping("/admin")
    public String showLoginPage(Model model) {
        model.addAttribute("LoginDEC", new LoginDEC());
        return "login/login_admin";
    }

//    @PostMapping("/login")
//    public RedirectView loginDonor(@ModelAttribute("donorLoginDEC") LoginDEC donorLoginDEC, BindingResult result, Model model) {
//
//        if (result.hasErrors()) {
//            return new RedirectView("/login/donor");
//        }
//
//        boolean isAuthenticated = donorService.authenticateDonor(donorLoginDEC.getYssId(), donorLoginDEC.getPassword());
//
//        if (!isAuthenticated) {
//            model.addAttribute("loginError", "Invalid email or password.");
//            return new RedirectView("/login/donor");
//        }
////        public RedirectView index() {
////            return new RedirectView("public/home");
////        }
//        return new RedirectView("/donor/dashboard"); // Redirect to donor dashboard after successful login
//    }

}
