package org.example.People;


public class Manager extends People{

    public Manager(String name) {
        super(name);
    }

    public void openZoo(){
        System.out.println("Zoo is now open");
    }

    public void closeZoo(){
        System.out.println("Zoo is now closed");
    }
}
