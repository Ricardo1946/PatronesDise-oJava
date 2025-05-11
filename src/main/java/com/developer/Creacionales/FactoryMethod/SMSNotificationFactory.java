package com.developer.Creacionales.FactoryMethod;

public class SMSNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
