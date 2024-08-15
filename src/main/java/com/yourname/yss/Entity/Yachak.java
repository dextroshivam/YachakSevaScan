//package com.yourname.yss.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.Set;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Yachak {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long yachakId;
//
//    private String name;
//    private String qrCode;  // QR code data
//
//    @OneToMany(mappedBy = "yachak")
//    private Set<Transaction> transactions;
//
//}
