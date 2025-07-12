package org.example.Animal;

public class Cheetah extends Feline{

    public Cheetah(String name) {
        super(name, "Cheetah");
    }

    @Override
    public void makeSound() {System.out.println("Hisses");}
}
