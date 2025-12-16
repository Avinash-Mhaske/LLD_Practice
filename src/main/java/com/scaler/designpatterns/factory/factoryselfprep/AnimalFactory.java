package com.scaler.designpatterns.factory.factoryselfprep;

public class AnimalFactory {

    public Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        }else if (type.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        return null;
    }
}
