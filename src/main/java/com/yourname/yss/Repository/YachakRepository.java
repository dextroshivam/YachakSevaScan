package com.yourname.yss.Repository;

import com.yourname.yss.Entity.Donor;
import com.yourname.yss.Entity.Yachak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YachakRepository extends JpaRepository<Yachak, Long> {
    Optional<Yachak> findByYssId(String yssId);
    // Custom query methods can be added here if needed
}
