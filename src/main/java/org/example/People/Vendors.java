package org.example.People;

import org.example.Building.Building;

public class Vendors extends People{
    public Vendors(String name) {
        super(name);
    }

    public Vendors(String name, Building location){
        super(name);
        this.goTo(location);
    }
    public void sell(){
        System.out.println("I sold you this");
    }
}
