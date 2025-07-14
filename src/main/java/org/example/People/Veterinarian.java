package org.example.People;

public class Veterinarian extends People{

    public Veterinarian(String name) {
        super(name);
    }

    public void heal(){
        System.out.println("Animal is now healed");
    }

    public void lecture(){
        System.out.printf("%s gave lecture\n", this.getName());
    }
}
