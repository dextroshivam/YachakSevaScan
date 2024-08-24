package com.yourname.yss.Service.ServiceImpl;

import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Repository.DonorRepository;
import com.yourname.yss.Service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DonorServiceImpl implements DonorService {

    private final DonorRepository donorRepository;

    //
//    @Override
//    public Optional<Donor> getDonorById(Long donorId) {
//        return donorRepository.findById(donorId);
//    }
//
    @Override
    public Donor saveDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    //
//    @Override
//    public Donor updateDonor(Donor donor) {
//        return donorRepository.save(donor);
//    }
//
//    @Override
//    public void deleteDonor(Long donorId) {
//        donorRepository.deleteById(donorId);
//    }

}
