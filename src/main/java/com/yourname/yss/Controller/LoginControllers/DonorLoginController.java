package com.yourname.yss.Controller.LoginControllers;

import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.User;
import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Repository.DonorRepository;
import com.yourname.yss.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class DonorLoginController {

//    @Autowired
//    DonorRepository donorRepository;
//    @Autowired
//    UserRepository userRepository;

//    @PostMapping("/donor")
//    public String loginDonor(@ModelAttribute("Donor") Donor donor, Model model) {
//
//        // save donor
//        // user--> create user
//
//        User user = new User();
//        user.setFullName(donor.getFullName());
//        user.setEmail(donor.getEmail());
//        user.setRole(UserRole.DONOR);
//        user.setPassword(donor.getPassword());
//
//        // try saving the donor;
//        if (user.getEmail() != null && donor.getEmail() != null) {
//            donorRepository.save(donor);
//            userRepository.save(user);
//
//        }
//
//        System.out.println(donor);
//        return "login/login_donor";
//    }

    @GetMapping("/donor")
    public String redirectTologinDonor() {
        return "login/login_donor";
    }
}
