package com.developer.Creacionales.AbstractFactory.domain.model;

public class Octopus implements Animal {
    @Override
    public String getAnimal() {
        return "Octopus";
    }

    @Override
    public String makeSound() {
        return "Octopus sound";
    }
}
