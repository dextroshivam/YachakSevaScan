package com.yourname.yss.Config;

import com.yourname.yss.Entity.Users;
import com.yourname.yss.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.getUserByUsername(username);
        if (user != null) {
            CustomUserDetails customUserDetails = new CustomUserDetails(user);
            return customUserDetails;
        } else {
            throw new UsernameNotFoundException("Yss Id not Found");
        }
    }
}

