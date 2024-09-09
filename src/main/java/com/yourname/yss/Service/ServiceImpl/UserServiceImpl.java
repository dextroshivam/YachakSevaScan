package com.yourname.yss.Service.ServiceImpl;

import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.Users;
import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Repository.UserRepository;
import com.yourname.yss.Service.UserService;
import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    // check login credentials
    public boolean authenticateUser(String yssId, String password) {
        Optional<Users> user = userRepository.findByYssId(yssId);

        if (user != null && bCryptPasswordEncoder.matches(password, user.get().getPassword())) {
            return true;
        }
        return false;
    }

//    @Override
//    public Optional<User> getUserById(Long userId) {
//        return userRepository.findById(userId);
//    }

//    @Override
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }


    //    @Override
//    public User updateUser(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public void deleteUser(Long userId) {
//        userRepository.deleteById(userId);
//    }
}
