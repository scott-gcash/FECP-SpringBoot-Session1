package org.example.Animal;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name, "Parrot");
    }

    @Override
    public void makeSound() {System.out.println("Squawk squawk...");}
}
