package com.yourname.yss.Entity;

import com.yourname.yss.Enum.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Yachak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "yss_id", unique = true)
    private String yssId;

    @NotBlank
    @Column(name = "fullName")
    private String fullName;

    @Column(name = "dateOfBirth")
    private LocalDate dob;
    @NotBlank
    private String password;

    //    private String qrCode;  // QR code data
    private String address;  // Optional, to know where they usually stay
    private String healthCondition; // Optional, to help identify the Yachak
    private String uniqueSign;          // Optional, any unique characteristic or sign for identification
    //    private String photoUrl;
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.YACHAK;

//    @OneToMany(mappedBy = "yachak")
//    private Set<Transaction> transactions;

}
