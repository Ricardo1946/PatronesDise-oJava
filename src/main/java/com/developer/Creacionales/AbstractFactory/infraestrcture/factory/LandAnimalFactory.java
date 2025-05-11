package com.developer.Creacionales.AbstractFactory.infraestrcture.factory;

import com.developer.Creacionales.AbstractFactory.domain.model.Dog;
import com.developer.Creacionales.AbstractFactory.domain.factory.AnimalFactory;
import com.developer.Creacionales.AbstractFactory.domain.model.Animal;
import com.developer.Creacionales.AbstractFactory.domain.model.Duck;

public class LandAnimalFactory  implements AnimalFactory {

    public Animal createAnimal(String type) {
        return switch (type) {
            case "Dog" -> new Dog();
            case "Duck" -> new Duck();
            default -> null;
        };

    }
}
