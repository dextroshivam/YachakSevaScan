//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Feedback;
//import com.yourname.yss.Repository.FeedbackRepository;
//import com.yourname.yss.Service.FeedbackService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class FeedbackServiceImpl implements FeedbackService {
//
//    private final FeedbackRepository feedbackRepository;
//
//    @Override
//    public Optional<Feedback> getFeedbackById(Long feedbackId) {
//        return feedbackRepository.findById(feedbackId);
//    }
//
//    @Override
//    public Feedback createFeedback(Feedback feedback) {
//        return feedbackRepository.save(feedback);
//    }
//
//    @Override
//    public Feedback updateFeedback(Feedback feedback) {
//        return feedbackRepository.save(feedback);
//    }
//
//    @Override
//    public void deleteFeedback(Long feedbackId) {
//        feedbackRepository.deleteById(feedbackId);
//    }
//}
