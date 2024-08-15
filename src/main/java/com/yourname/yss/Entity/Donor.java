//package com.yourname.yss.Entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.AllArgsConstructor;
//
//import java.util.Set;
//
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class Donor {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long donorId;
//
//    private String name;
//    private String email;
//
//    @OneToMany(mappedBy = "donor")
//    private Set<Transaction> transactions;
//
//
//}
