package org.example.Animal;

import org.example.Building.Building;

public abstract class Feline extends Animal{

    private Building location;

    public Feline(String name, String species) {
        super(name, species);
    }

    @Override
    public void roam() {
        System.out.println("Feline roams...");
    }
}
