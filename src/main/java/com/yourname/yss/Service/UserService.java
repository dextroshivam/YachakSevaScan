package com.yourname.yss.Service;

import com.yourname.yss.DTO.RequestDTO.UserRequestDTO;
import com.yourname.yss.DTO.ResponseDTO.UserResponseDTO;
import com.yourname.yss.Entity.User;

import java.util.Optional;

public interface UserService {
    UserResponseDTO registerUser(UserRequestDTO userRequestDto);

//    Optional<User> getUserById(Long userId);


//    User updateUser(User user);

//    void deleteUser(Long userId);

}
