//package com.yourname.yss.Entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Data
//@NoArgsConstructor
//public class Report {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String title;
//    private String content;
//    private LocalDateTime generatedAt;
//
//    @ManyToOne
//    @JoinColumn(name = "generated_by", nullable = false)
//    private User generatedBy;
//
//    // Other fields as needed
//}
