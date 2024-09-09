package com.yourname.yss.Entity;

import com.yourname.yss.Enum.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "yss_id", unique = true)
    private String yssId;
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.SUPER_ADMIN;

    private String username;
    private String email;

    // Additional fields and methods specific to Super Admins
}

