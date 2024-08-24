package com.yourname.yss.Controller.RegistrationControllers;

import com.yourname.yss.Config.YssIdConfiguration;
import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.User;
import com.yourname.yss.Entity.Yachak;
import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Repository.YachakRepository;
import com.yourname.yss.Service.DonorService;
import com.yourname.yss.Service.UserService;
import com.yourname.yss.Service.YachakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class YachakRegistrationController {

    @Autowired
    YachakService yachakService;
    @Autowired
    UserService userService;
    @Autowired
    YssIdConfiguration yssIdConfiguration;

    @GetMapping("/yachak")
    public String signup(Model model) {
        model.addAttribute("yachak", new Yachak());
        return "Registration/register_yachak";
    }

    @PostMapping("/yachakRegistered")
    public String saveYachak(@ModelAttribute("yachak") Yachak yachak, Model model) {
        // generete yssId
        String yssId = yssIdConfiguration.generateUniqueYssId(UserRole.YACHAK);
        yachak.setYssId(yssId);

        // save yachak
        // user--> create user
        User user = new User();
        user.setFullName(yachak.getFullName());
        user.setRole(UserRole.YACHAK);
        user.setPassword(yachak.getPassword());
        user.setYssId(yssId);

        // saving the donor;
        yachakService.saveYachak(yachak);
        userService.saveUser(user);

        model.addAttribute("yssId", yssId);
        return "Registration/yachak_registered";
    }

}
