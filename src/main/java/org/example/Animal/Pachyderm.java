package org.example.Animal;

import org.example.Building.Building;

public abstract class Pachyderm extends Animal{

    private Building location;

    @Override
    public void roam() {System.out.println("Pachyderm roams...");}
}
