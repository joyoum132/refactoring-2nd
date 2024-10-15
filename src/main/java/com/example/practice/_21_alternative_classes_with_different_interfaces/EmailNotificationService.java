package com.example.practice._21_alternative_classes_with_different_interfaces;

public class EmailNotificationService implements NotificationService {

    private EmailService emailService;

    @Override
    public void sendNotification(Notification notification) {
        EmailMessage message = new EmailMessage();
        message.setTitle(notification.getTitle());
        message.setTo(notification.getReceiver());
        message.setFrom(notification.getSender());
        emailService.sendEmail(message);
    }
}
