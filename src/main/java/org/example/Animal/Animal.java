package org.example.Animal;

public abstract class Animal {

    private boolean healthy = true;
    private String name;
    private String species;

    public Animal(String name, String species){
        this.species = species;
        this.name = name;
    }

    public abstract void makeSound();
    public abstract void roam();

    public void eat(){System.out.println("Animal is eating...");}

    public void sleep(){System.out.println("Animal is sleeping...");}
}
