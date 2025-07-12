package org.example.Animal;

public class Tiger extends Feline{

    public Tiger(String name) {
        super(name, "Tiger");
    }

    @Override
    public void makeSound() {System.out.println("Growl");}
}
