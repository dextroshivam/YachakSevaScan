//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.Notification;
//import com.yourname.yss.Service.NotificationService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/notifications")
//@RequiredArgsConstructor
//public class NotificationController {
//
//    private final NotificationService notificationService;
//
//    @PostMapping("/send")
//    public Notification sendNotification(@RequestBody NotificationRequest request) {
//        return notificationService.sendNotification(request);
//    }
//
//    @GetMapping("/user/{userId}")
//    public List<Notification> getUserNotifications(@PathVariable Long userId) {
//        return notificationService.getNotificationsForUser(userId);
//    }
//}
