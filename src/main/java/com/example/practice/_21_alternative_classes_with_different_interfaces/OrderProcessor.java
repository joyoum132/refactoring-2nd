package com.example.practice._21_alternative_classes_with_different_interfaces;

public class OrderProcessor {

    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyShipping(Shipping shipping) {

        Notification notification = Notification.newNotification(shipping.getOrder()+"is shipped")
                .receiver(shipping.getEmail())
                .sender("no-reply@whiteship.com");
        notificationService.sendNotification(notification);
    }
}
