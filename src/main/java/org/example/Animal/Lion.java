package org.example.Animal;

public class Lion extends Feline{

    public Lion(String name) {
        super(name, "Lion");
    }

    @Override
    public void makeSound() {System.out.println("Roar");}
}
