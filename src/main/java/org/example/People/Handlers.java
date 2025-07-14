package org.example.People;


import org.example.Building.Building;
import org.example.Building.Enclosure;

public class Handlers extends People{
    private Enclosure assignedEnclosure;

    public Handlers(String name) {
        super(name);
    }


    public Handlers(String name, Building location){
        super(name);
        this.goTo(location);
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
