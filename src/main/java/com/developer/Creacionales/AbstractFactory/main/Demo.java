package com.developer.Creacionales.AbstractFactory.main;

import com.developer.Creacionales.AbstractFactory.config.AnimalFactoryProvider;
import com.developer.Creacionales.AbstractFactory.domain.factory.AnimalFactory;
import com.developer.Creacionales.AbstractFactory.domain.model.Animal;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        AnimalFactory factory = AnimalFactoryProvider.getFactory("Sea");
        Animal animal = factory.createAnimal("Shark");

        System.out.println(animal.getAnimal());
        System.out.println(animal.makeSound());
    }

}
