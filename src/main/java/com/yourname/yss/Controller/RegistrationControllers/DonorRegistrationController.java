package com.yourname.yss.Controller.RegistrationControllers;

import com.yourname.yss.Config.YssIdConfiguration;
import com.yourname.yss.DEC.DonorRegistrationDEC;
import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.Users;
import com.yourname.yss.Entity.Users;
import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Service.DonorService;
import com.yourname.yss.Service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class DonorRegistrationController {

    @Autowired
    DonorService donorService;
    @Autowired
    UserService userService;
    @Autowired
    YssIdConfiguration yssIdConfiguration;
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    DonorRegistrationDEC donorRegistrationDEC;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/donor")
    public String signup(Model model) {
        donorRegistrationDEC.setDonor(new Donor());
        model.addAttribute("donorRegistrationDEC", donorRegistrationDEC);
        return "Registration/register_donor";
    }


    @PostMapping("/donorRegistered")
    public String saveDonor(@ModelAttribute("Donor") Donor donor, Model model) {
        boolean emailExists = donorService.isEmailAlreadyRegistered(donor.getEmail());

        {//        if (emailExists) {
//            donorRegistrationDEC.setEmailExist(true);
//            donorRegistrationDEC.setEmailError("Email Already Exist !");
//            model.addAttribute("donorRegistrationDEC", donorRegistrationDEC);
//            return "Registration/register_donor";
//        }
            // generete yssId
        }

        String yssId = yssIdConfiguration.generateUniqueYssId(UserRole.DONOR);
        donor.setYssId(yssId);

        // save donor
        // user--> create user
        Users user = new Users();
        user.setFullName(donor.getFullName());
        user.setRole(UserRole.DONOR);
        user.setPassword(bCryptPasswordEncoder.encode(donor.getPassword()));
        user.setYssId(yssId);

        // saving the donor;

        donorService.saveDonor(donor);
        userService.saveUser(user);

        //send confirmation email
        sendEmail(donor.getEmail(), yssId);

        model.addAttribute("yssId", yssId);
        return "Registration/donor_registered";
    }

    public void sendEmail(String to, String yssId) {
        String subject = "Registration Successfull";
        String text =
                """
                        Congratulations! You're successfully registered as a Donor with Yachak Seva Scan.
                        
                        Your Unique YSS Id is: """ + yssId +
                        """
                                .
                                Please login to YSS Portal with this Yss Id.
                                
                                Let's create an impract together.
                                
                                Best Regards,
                                YSS Team
                                """;
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        javaMailSender.send(message);
    }

}
