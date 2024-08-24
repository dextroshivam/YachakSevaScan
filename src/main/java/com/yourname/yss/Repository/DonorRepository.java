package com.yourname.yss.Repository;

import com.yourname.yss.Entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {
    // Custom query methods can be added here if needed
    Optional<Donor> findByYssId(String yssId);
}
