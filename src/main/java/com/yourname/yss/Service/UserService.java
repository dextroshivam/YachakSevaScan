package com.yourname.yss.Service;

import com.yourname.yss.Entity.Users;

public interface UserService {


    Users saveUser(Users user);

    boolean authenticateUser(String yssId, String password);


//    Optional<User> getUserById(Long userId);


//    User updateUser(User user);

//    void deleteUser(Long userId);

}
