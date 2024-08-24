package com.yourname.yss.Service;

import com.yourname.yss.DTO.RequestDTO.UserRequestDTO;
import com.yourname.yss.DTO.ResponseDTO.UserResponseDTO;
import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.User;
import org.springframework.ui.Model;

import java.util.Optional;

public interface UserService {


    User saveUser(User user);


//    Optional<User> getUserById(Long userId);


//    User updateUser(User user);

//    void deleteUser(Long userId);

}
