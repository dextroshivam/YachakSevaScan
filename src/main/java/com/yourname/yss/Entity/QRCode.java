//package com.yourname.yss.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class QRCode {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long qrCodeId;
//
//    private String codeData;
//
//    @OneToOne
//    @JoinColumn(name = "yachak_id")
//    private Yachak yachak;
//}
