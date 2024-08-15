//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.Feedback;
//import com.yourname.yss.Service.FeedbackService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/feedback")
//@RequiredArgsConstructor
//public class FeedbackController {
//
//    private final FeedbackService feedbackService;
//
//    @PostMapping("/submit")
//    public Feedback submitFeedback(@RequestBody FeedbackRequest request) {
//        return feedbackService.submitFeedback(request);
//    }
//
//    @GetMapping("/{yachakId}")
//    public List<Feedback> getFeedback(@PathVariable Long yachakId) {
//        return feedbackService.getFeedbackForYachak(yachakId);
//    }
//}
