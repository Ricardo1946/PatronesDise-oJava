package com.developer.Creacionales.AbstractFactory.domain.model;

public class Shark implements Animal {

    @Override
    public String getAnimal() {
        return "Shark";
    }

    @Override
    public String makeSound() {
        return "Shark sound";
    }
}
