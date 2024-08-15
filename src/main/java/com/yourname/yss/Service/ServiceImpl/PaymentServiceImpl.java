//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Payment;
//import com.yourname.yss.Repository.PaymentRepository;
//import com.yourname.yss.Service.PaymentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class PaymentServiceImpl implements PaymentService {
//
//    private final PaymentRepository paymentRepository;
//
//    @Override
//    public Optional<Payment> getPaymentById(Long paymentId) {
//        return paymentRepository.findById(paymentId);
//    }
//
//    @Override
//    public Payment createPayment(Payment payment) {
//        return paymentRepository.save(payment);
//    }
//
//    @Override
//    public Payment updatePayment(Payment payment) {
//        return paymentRepository.save(payment);
//    }
//
//    @Override
//    public void deletePayment(Long paymentId) {
//        paymentRepository.deleteById(paymentId);
//    }
//}
