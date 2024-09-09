package com.yourname.yss.Service.ServiceImpl;

import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Repository.DonorRepository;
import com.yourname.yss.Service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DonorServiceImpl implements DonorService {

    @Autowired
    private final DonorRepository donorRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    // save donor
    @Override
    public Donor saveDonor(Donor donor) {
        donor.setPassword(bCryptPasswordEncoder.encode(donor.getPassword()));
        return donorRepository.save(donor);
    }

    // check if email is already existing or not
    @Override
    public boolean isEmailAlreadyRegistered(String email) {
        boolean entity = donorRepository.findByEmail(email).isPresent();
        return entity;
    }

    // check login credentials
    public boolean authenticateDonor(String yssId, String password) {
        Optional<Donor> donor = donorRepository.findByYssId(yssId);

        if (donor != null && bCryptPasswordEncoder.matches(password, donor.get().getPassword())) {
            return true;
        }
        return false;
    }
}
