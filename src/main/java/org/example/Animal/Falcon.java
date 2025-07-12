package org.example.Animal;

public class Falcon extends Bird{

    public Falcon(String name) {
        super(name, "Falcon");
    }

    @Override
    public void makeSound() {System.out.println("Kik kik kik...");}
}
