//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Notification;
//import com.yourname.yss.Repository.NotificationRepository;
//import com.yourname.yss.Service.NotificationService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class NotificationServiceImpl implements NotificationService {
//
//    private final NotificationRepository notificationRepository;
//
//    @Override
//    public Optional<Notification> getNotificationById(Long notificationId) {
//        return notificationRepository.findById(notificationId);
//    }
//
//    @Override
//    public Notification createNotification(Notification notification) {
//        return notificationRepository.save(notification);
//    }
//
//    @Override
//    public Notification updateNotification(Notification notification) {
//        return notificationRepository.save(notification);
//    }
//
//    @Override
//    public void deleteNotification(Long notificationId) {
//        notificationRepository.deleteById(notificationId);
//    }
//}
