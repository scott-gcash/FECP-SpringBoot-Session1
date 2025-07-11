package org.example.Animal;

public abstract class Feline extends Animal{

    private Building location;

    @Override
    public void roam() {
        System.out.println("Feline roams...");
    }
}
