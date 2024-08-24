package com.yourname.yss.Controller.RegistrationControllers;

import com.yourname.yss.Config.YssIdConfiguration;
import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.User;
import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Service.DonorService;
import com.yourname.yss.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class DonorRegistrationController {

    @Autowired
    DonorService donorService;
    @Autowired
    UserService userService;
    @Autowired
    YssIdConfiguration yssIdConfiguration;

    @GetMapping("/donor")
    public String signup(Model model) {

        model.addAttribute("Donor", new Donor());
        return "Registration/register_donor";
    }

    @PostMapping("/donorRegistered")
    public String saveDonor(@ModelAttribute("Donor") Donor donor, Model model) {
        // generete yssId
        String yssId = yssIdConfiguration.generateUniqueYssId(UserRole.DONOR);
        donor.setYssId(yssId);

        // save donor
        // user--> create user
        User user = new User();
        user.setFullName(donor.getFullName());
        user.setRole(UserRole.DONOR);
        user.setPassword(donor.getPassword());
        user.setYssId(yssId);

        // saving the donor;
        donorService.saveDonor(donor);
        userService.saveUser(user);

        model.addAttribute("yssId", yssId);
        return "Registration/donor_registered";
    }

}
