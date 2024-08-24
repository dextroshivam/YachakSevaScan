package com.yourname.yss.Repository;

import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Method to find a user by their username

    Optional<User> findByYssId(String yssId);

    // You can add more custom queries if needed
}

