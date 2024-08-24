package com.yourname.yss.Service.ServiceImpl;

import com.yourname.yss.Entity.User;
import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Repository.UserRepository;
import com.yourname.yss.Service.UserService;
import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
//        user.setYssId(generateUniqueYssId(UserRole.USER.toString(), userRepository));
        // add yss id auto-generation
        return userRepository.save(user);
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
