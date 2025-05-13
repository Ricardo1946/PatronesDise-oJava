package com.developer.Creacionales.Singleton;

public class App {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        System.out.println("App: " + config.getProperty("app.name"));
        System.out.println("Version: " + config.getProperty("app.version"));
    }
}
