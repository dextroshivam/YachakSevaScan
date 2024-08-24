package com.yourname.yss.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
//import javax.persistence.*;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "donors")
@Data
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "yss_id", unique = true)
    private String yssId;

    @NotBlank
    @Column(name = "fullName")
    private String fullName;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    @Column(name = "phoneNumber")
    private String phoneNumber;

    @NotNull
    @Column(name = "dateOfBirth")
    private LocalDate dob;

    @NotBlank
    private String address;

    @NotBlank
    private String password;

//    @OneToMany(mappedBy = "yachak")
//    private Set<Transaction> transactions;

    // Add any additional fields or methods if needed
}
