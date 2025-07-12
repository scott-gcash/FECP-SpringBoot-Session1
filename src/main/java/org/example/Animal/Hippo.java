package org.example.Animal;

public class Hippo extends Pachyderm {

    public Hippo(String name) {
        super(name, "Hippo");
    }

    @Override
    public void makeSound() {System.out.println("Wheezes");}
}
