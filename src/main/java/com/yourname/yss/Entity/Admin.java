package com.yourname.yss.Entity;

import com.yourname.yss.Enum.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "yss_id", unique = true)
    private String yssId;

    private String username;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.ADMIN;

    // Additional fields and methods specific to Admins
}
