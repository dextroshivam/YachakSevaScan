//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Transaction;
//import com.yourname.yss.Repository.TransactionRepository;
//import com.yourname.yss.Service.TransactionService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class TransactionServiceImpl implements TransactionService {
//
//    private final TransactionRepository transactionRepository;
//
//    @Override
//    public Optional<Transaction> getTransactionById(Long transactionId) {
//        return transactionRepository.findById(transactionId);
//    }
//
//    @Override
//    public Transaction createTransaction(Transaction transaction) {
//        return transactionRepository.save(transaction);
//    }
//
//    @Override
//    public Transaction updateTransaction(Transaction transaction) {
//        return transactionRepository.save(transaction);
//    }
//
//    @Override
//    public void deleteTransaction(Long transactionId) {
//        transactionRepository.deleteById(transactionId);
//    }
//}
//
