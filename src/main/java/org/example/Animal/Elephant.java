package org.example.Animal;

public class Elephant extends Pachyderm{

    public Elephant(String name) {
        super(name, "Elephant");
    }

    @Override
    public void makeSound() {System.out.println("Trumpets");}
}
