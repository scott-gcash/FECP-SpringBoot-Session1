package org.example.People;

public class Vendors extends People{
    public Vendors(String name) {
        super(name);
    }

    public void sell(){
        System.out.println("I sold you this");
    }
}
