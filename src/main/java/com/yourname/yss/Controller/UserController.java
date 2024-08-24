//package com.yourname.yss.Controller;
//
//import com.yourname.yss.DTO.RequestDTO.UserRequestDTO;
//import com.yourname.yss.DTO.ResponseDTO.UserResponseDTO;
//import com.yourname.yss.Service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users")
//@RequiredArgsConstructor
//public class UserController {
//
//    @Autowired
//    private final UserService userService;
//
//    @PostMapping("public/register")
//    public ResponseEntity<UserResponseDTO> registerUser(@RequestBody UserRequestDTO userRequestDto) {
//        UserResponseDTO createdUser = userService.registerUser(userRequestDto);
//        return ResponseEntity.ok(createdUser);
//    }
//
//
////    @GetMapping("/{id}")
////    public Optional<User> getUserDetails(@PathVariable Long id) {
////        return userService.getUserById(id);
////    }
//
////    @PutMapping("/{id}")
////    public User updateUserDetails(@PathVariable Long id, @RequestBody UserUpdateRequest request) {
////        return userService.updateUser(id, request);
////    }
//}
