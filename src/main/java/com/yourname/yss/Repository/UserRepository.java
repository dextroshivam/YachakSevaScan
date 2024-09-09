package com.yourname.yss.Repository;

import com.yourname.yss.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    // Method to find a user by their username

    Optional<Users> findByYssId(String yssId);

    @Query("select u from Users u where u.yssId = :yssId")
    Users getUserByUsername(@Param("yssId") String yssId);
    // You can add more custom queries if needed
}

