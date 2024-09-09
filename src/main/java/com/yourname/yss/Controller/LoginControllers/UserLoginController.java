package com.yourname.yss.Controller.LoginControllers;

import com.yourname.yss.DEC.LoginDEC;
import com.yourname.yss.Service.UserService;
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
public class UserLoginController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public String showLoginPage(Model model) {
        model.addAttribute("LoginDEC", new LoginDEC());

        return "login/login_user";
    }

    @PostMapping("/userLoggedIn")
    public String userLoggedIn(@ModelAttribute("LoginDEC") LoginDEC loginDEC, Model model, BindingResult result) {

        System.out.println("Login DEC :  " + loginDEC + "---------");
        boolean isAuthenticated = userService.authenticateUser(loginDEC.getYssId(), loginDEC.getPassword());
        System.out.println("Authentication :" + isAuthenticated);
        if (!isAuthenticated) {
            loginDEC.setLoginError("Invalid email or password.");
            model.addAttribute("LoginDEC", loginDEC);
            return "login/badCredentials";
        }
//        return new RedirectView("/donor/dashboard"); // Redirect to donor dashboard after successful login
        return "login/user_loggedIn";
    }

}
