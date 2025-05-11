package com.developer.Creacionales.AbstractFactory.infraestrcture.factory;

import com.developer.Creacionales.AbstractFactory.domain.factory.AnimalFactory;
import com.developer.Creacionales.AbstractFactory.domain.model.Animal;
import com.developer.Creacionales.AbstractFactory.domain.model.Octopus;
import com.developer.Creacionales.AbstractFactory.domain.model.Shark;

public class SeaAnimalFactory  implements AnimalFactory {

    public Animal createAnimal(String type) {
        return switch (type) {
            case "Shark" -> new Shark();
            case "Octopus" -> new Octopus();
            default -> null;
        };
    }
}
