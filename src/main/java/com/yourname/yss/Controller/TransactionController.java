//package com.yourname.yss.Controller;
//
//
//import com.yourname.yss.Entity.Transaction;
//import com.yourname.yss.Service.TransactionService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/transactions")
//@RequiredArgsConstructor
//public class TransactionController {
//
//    private final TransactionService transactionService;
//
//    @PreAuthorize("hasRole('DONOR')")
//    @PostMapping("/initiate")
//    public Transaction initiateTransaction(@RequestParam Long donorId, @RequestParam Long yachakId, @RequestParam double amount) {
//        return transactionService.initiateTransaction(donorId, yachakId, amount);
//    }
//
//    @PreAuthorize("hasAnyRole('DONOR', 'YACHAK')")
//    @GetMapping("/history")
//    public List<Transaction> getTransactionHistory(@RequestParam Long userId) {
//        return transactionService.getTransactionHistory(userId);
//    }
//
//    // Add more endpoints as needed
//}
