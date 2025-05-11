package com.developer.Creacionales.AbstractFactory.domain.model;

public class Duck implements Animal{

    public String getAnimal() {
        return "Duck";
    }

    public String makeSound() {
        return "Quack";
    }
}
