package com.developer.Creacionales.FactoryMethod;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
