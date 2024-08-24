package com.yourname.yss.Repository;

import com.yourname.yss.Entity.Admin;
import com.yourname.yss.Entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByYssId(String yssId);
    // Custom query methods can be added here if needed
}

