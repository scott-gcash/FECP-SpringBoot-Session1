package org.example.Animal;

public class Rhino extends Pachyderm{

    public Rhino(String name) {
        super(name, "Rhino");
    }

    @Override
    public void makeSound() {System.out.println("Grunts");}
}
