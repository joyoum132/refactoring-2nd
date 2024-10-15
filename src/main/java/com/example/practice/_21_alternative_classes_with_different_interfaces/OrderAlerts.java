package com.example.practice._21_alternative_classes_with_different_interfaces;

public class OrderAlerts {

    private final NotificationService notificationService;

    public OrderAlerts(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(Order order) {
        Notification notification = Notification.newNotification(order.toString()+"is shipped")
                .receiver(order.getEmail())
                .sender("no-reply@whiteship.com");
        notificationService.sendNotification(notification);
    }
}
