package com.yourname.yss.Entity;

import com.yourname.yss.Enum.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "yss_id", unique = true)
    private String yssId;

    @Column(nullable = false)
    @NotEmpty(message = "Full name is required")
    @Size(max = 100, message = "Full name cannot exceed 100 characters")
    private String fullName;

    @Column(nullable = false)
    @NotEmpty(message = "Password is required")
    private String password;
    // Additional fields and methods can be added as needed

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull(message = "Role is required")
    private UserRole role;
}
