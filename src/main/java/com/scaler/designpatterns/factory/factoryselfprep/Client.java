package com.scaler.designpatterns.factory.factoryselfprep;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        // Create a Dog
        Animal dog = factory.getAnimal("dog");
        dog.draw();

        // Create a Cat
        Animal cat = factory.getAnimal("cat");
        cat.draw();

        // Try an unknown Animal
        Animal unknown = factory.getAnimal("tiger");
        if (unknown == null) {
            System.out.println("Unknown Animal requested");
        }
    }

}
