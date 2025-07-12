package org.example.Animal;

import org.example.Building.Building;

public abstract class Pachyderm extends Animal{

    private Building location;

    public Pachyderm(String name, String species) {
        super(name, species);
    }

    @Override
    public void roam() {System.out.println("Pachyderm roams...");}
}
