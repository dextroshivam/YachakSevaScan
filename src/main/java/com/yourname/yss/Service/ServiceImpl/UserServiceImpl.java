package com.yourname.yss.Service.ServiceImpl;

import com.yourname.yss.DTO.RequestDTO.UserRequestDTO;
import com.yourname.yss.DTO.ResponseDTO.UserResponseDTO;
import com.yourname.yss.Entity.User;
import com.yourname.yss.Repository.UserRepository;
import com.yourname.yss.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public UserResponseDTO registerUser(UserRequestDTO userRequestDto) {
        // Convert DTO to Entity
        User user = modelMapper.map(userRequestDto, User.class);

        // Save the user to the database
        User savedUser = userRepository.save(user);

        // Convert saved Entity to DTO
        return modelMapper.map(savedUser, UserResponseDTO.class);
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
