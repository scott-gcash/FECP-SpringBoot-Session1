package org.example.Animal;

import org.example.Building.Building;

public abstract class Bird extends Animal{

    private Building location;

    public Bird(String name, String species) {
        super(name, species);
    }

    @Override
    public void roam() {System.out.println("Bird is roaming...");}

}
