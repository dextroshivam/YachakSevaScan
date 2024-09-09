package com.yourname.yss.Controller.LoginControllers;

import com.yourname.yss.DEC.LoginDEC;
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
public class DonorLoginController {

    @Autowired
    private DonorService donorService;
//    @Autowired
//    DonorLoginDEC donorLoginDEC;

    @GetMapping("/donor")
    public String showLoginPage(Model model) {
        model.addAttribute("donorLoginDEC", new LoginDEC());
        return "login/login_donor";
    }

    @PostMapping("/donorLoggedIn")
    public RedirectView loginDonor(@ModelAttribute("LoginDEC") LoginDEC donorLoginDEC, BindingResult result, Model model) {
//        System.out.println("Donor Login DEC : " + donorLoginDEC + "---------");
        if (result.hasErrors()) {
            return new RedirectView("/login/donor");
        }
        boolean isAuthenticated = donorService.authenticateDonor(donorLoginDEC.getYssId(), donorLoginDEC.getPassword());
        System.out.println("Authentication :" + isAuthenticated);
        if (!isAuthenticated) {
            model.addAttribute("loginError", "Invalid email or password.");
            return new RedirectView("/login/donor");
        }

        return new RedirectView("/donor/dashboard"); // Redirect to donor dashboard after successful login
    }


}

