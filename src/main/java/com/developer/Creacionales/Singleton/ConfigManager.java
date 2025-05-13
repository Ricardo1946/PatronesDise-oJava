package com.developer.Creacionales.Singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private Properties properties;

    private ConfigManager(){
        loadConfig();
    }

    private static class Holder {

        private static final ConfigManager INSTANCE = new ConfigManager();

    }

    public static ConfigManager getInstance() {
        return Holder.INSTANCE;

    }

    private void loadConfig() {
        properties = new Properties();

        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input != null) {
                properties.load(input);
            } else {
                System.out.println("Archivo de configuracion no encontrado.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
