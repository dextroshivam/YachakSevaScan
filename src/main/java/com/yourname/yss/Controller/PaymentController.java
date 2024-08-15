//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.Payment;
//import com.yourname.yss.Service.PaymentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/payments")
//@RequiredArgsConstructor
//public class PaymentController {
//
//    private final PaymentService paymentService;
//
//    @PostMapping("/initiate")
//    public Payment initiatePayment(@RequestBody PaymentRequest request) {
//        return paymentService.initiatePayment(request);
//    }
//
//    @GetMapping("/status/{paymentId}")
//    public PaymentStatus getPaymentStatus(@PathVariable String paymentId) {
//        return paymentService.getPaymentStatus(paymentId);
//    }
//}
