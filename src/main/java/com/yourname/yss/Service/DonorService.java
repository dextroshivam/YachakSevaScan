package com.yourname.yss.Service;

import com.yourname.yss.Entity.Donor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Optional;

public interface DonorService {
    // save donor in repo
    Donor saveDonor(Donor donor);

    // check login credentials
    boolean authenticateDonor(String yssId, String password);

    // check if email is already registered
    boolean isEmailAlreadyRegistered(@NotBlank @Email String email);
}
