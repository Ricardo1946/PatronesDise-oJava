package com.developer.Creacionales.AbstractFactory.domain.factory;

import com.developer.Creacionales.AbstractFactory.domain.model.Animal;

public interface AnimalFactory {
    Animal createAnimal(String type);
}
