//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Admin;
//import com.yourname.yss.Repository.AdminRepository;
//import com.yourname.yss.Service.AdminManagementService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class AdminManagementServiceImpl implements AdminManagementService {
//
//    private final AdminRepository adminRepository;
//
//    @Override
//    public Optional<Admin> getAdminById(Long adminId) {
//        return adminRepository.findById(adminId);
//    }
//
//    @Override
//    public Admin createAdmin(Admin admin) {
//        return adminRepository.save(admin);
//    }
//
//    @Override
//    public Admin updateAdmin(Admin admin) {
//        return adminRepository.save(admin);
//    }
//
//    @Override
//    public void deleteAdmin(Long adminId) {
//        adminRepository.deleteById(adminId);
//    }
//}
