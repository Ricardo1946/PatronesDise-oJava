package com.developer.Creacionales.AbstractFactory.domain.model;

public class Dog implements Animal {

    public String getAnimal() {
        return "Dog";
    }

    public String makeSound() {
        return "Bark";
    }

}
