//package com.yourname.yss.DTO.RequestDTO;
//
//import jakarta.validation.constraints.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
////import javax.validation.constraints.Email;
////import javax.validation.constraints.NotBlank;
////import javax.validation.constraints.NotNull;
////import javax.validation.constraints.Past;
////import javax.validation.constraints.Size;
//import java.time.LocalDate;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class DonorRequestDTO {
//
//    @NotBlank(message = "Full name is required")
//    private String fullName;
//
//    @Email(message = "Please provide a valid email address")
//    @NotBlank(message = "Email is required")
//    private String email;
//
//    @NotBlank(message = "Phone number is required")
//    @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 digits")
//    private String phoneNumber;
//
//    @NotNull(message = "Date of birth is required")
//    @Past(message = "Date of birth must be in the past")
//    private LocalDate dob;
//
//    @NotBlank(message = "Address is required")
//    private String address;
//
//    @NotBlank(message = "Password is required")
//    private String password;
//}
