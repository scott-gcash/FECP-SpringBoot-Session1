package org.example.People;

public class Handlers extends People{

    public Handlers(String name) {
        super(name);
    }

    public void feed(){
        System.out.println("I feed");
    }

    public void exercise(){
        System.out.println("I exercise");
    }

    public void examine(){
        System.out.println("I examine");
    }
}
