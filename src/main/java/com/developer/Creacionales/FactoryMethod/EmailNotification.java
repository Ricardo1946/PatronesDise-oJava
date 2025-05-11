package com.developer.Creacionales.FactoryMethod;

public class EmailNotification  implements Notification {
    public void notifyUser() {
        System.out.println("Enviando una notificación por correo electrónico.");
    }
}
