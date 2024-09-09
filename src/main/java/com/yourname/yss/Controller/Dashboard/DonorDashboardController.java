package com.yourname.yss.Controller.Dashboard;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Data
@RequestMapping("/donor")
public class DonorDashboardController {

    @PostMapping("/dashboard")
    public String dashboard() {
        return "Dashboard/donor_dashboard";
    }

}
