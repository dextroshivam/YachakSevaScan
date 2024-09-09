package com.yourname.yss.DEC;

import com.yourname.yss.Entity.Donor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class DonorRegistrationDEC {
    Donor donor;
    boolean isEmailExist;
    String emailError = "";
}
