//package com.yourname.yss.Entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//
//import java.time.LocalDateTime;
//
//@Entity
//@Data
//@NoArgsConstructor
//public class Notification {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    private String message;
//    private LocalDateTime timestamp;
//    private boolean read;
//
//    // Other fields as needed
//}
