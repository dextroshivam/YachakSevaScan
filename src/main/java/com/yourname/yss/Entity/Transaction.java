//package com.yourname.yss.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Transaction {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long transactionId;
//
//    private Double amount;
//    private LocalDateTime timestamp;
//
//    @ManyToOne
//    @JoinColumn(name = "donor_id")
//    private Donor donor;
//
//    @ManyToOne
//    @JoinColumn(name = "yachak_id")
//    private Yachak yachak;
//}
//
