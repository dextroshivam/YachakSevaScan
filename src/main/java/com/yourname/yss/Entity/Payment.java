//package com.yourname.yss.Entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "payments")
//public class Payment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private BigDecimal amount;
//
//    @Column(nullable = false)
//    private LocalDateTime date;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "donor_id", nullable = false)
//    private Donor donor;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "transaction_id", nullable = false)
//    private Transaction transaction;
//
//    // Additional attributes and methods as needed
//}
//
