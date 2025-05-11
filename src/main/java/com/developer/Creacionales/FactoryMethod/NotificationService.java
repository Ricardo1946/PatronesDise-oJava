package com.developer.Creacionales.FactoryMethod;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();

        notification.notifyUser();
    }
}
