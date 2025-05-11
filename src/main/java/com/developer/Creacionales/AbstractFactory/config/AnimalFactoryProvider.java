package com.developer.Creacionales.AbstractFactory.config;

import com.developer.Creacionales.AbstractFactory.domain.factory.AnimalFactory;
import com.developer.Creacionales.AbstractFactory.infraestrcture.factory.LandAnimalFactory;
import com.developer.Creacionales.AbstractFactory.infraestrcture.factory.SeaAnimalFactory;

public class AnimalFactoryProvider {

    public static AnimalFactory getFactory(String type) {
        return switch (type) {
            case "Land" -> new LandAnimalFactory();
            case "Sea" -> new SeaAnimalFactory();
            default -> null;
        };
    }
}
