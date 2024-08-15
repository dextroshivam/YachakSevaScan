package com.yourname.yss.Repository;

import com.yourname.yss.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Method to find a user by their username
    Optional<User> findByUsername(String username);

    // You can add more custom queries if needed
}

