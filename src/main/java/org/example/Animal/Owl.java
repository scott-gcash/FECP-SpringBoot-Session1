package org.example.Animal;

public class Owl extends Bird{

    public Owl(String name) {
        super(name, "Owl");
    }

    @Override
    public void makeSound() {System.out.println("Hoot hoot...");}

}
