package org.example.Animal;

abstract class Animal {

    private boolean healthy;
    private String name;
    private String species;

    public abstract void makeSound();
    public abstract void roam();

    public void eat(){System.out.println("Animal is eating...");}

    public void sleep(){System.out.println("Animal is sleeping...");}

}
