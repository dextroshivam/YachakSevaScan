//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.User;
//import com.yourname.yss.Repository.UserRepository;
//import com.yourname.yss.Service.AuthenticationService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class AuthenticationServiceImpl implements AuthenticationService {
//
//    private final UserRepository userRepository;
//
//    private final BCryptPasswordEncoder passwordEncoder;
//
//    @Override
//    public Optional<User> authenticate(String username, String password) {
//        Optional<User> user = userRepository.findByUsername(username);
//        if (user != null && passwordEncoder.matches(password, user.get().getPassword())) {
//            return user;
//        }
//        throw new RuntimeException("Invalid credentials");
//    }
//
//    @Override
//    public void register(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
//    }
//}
