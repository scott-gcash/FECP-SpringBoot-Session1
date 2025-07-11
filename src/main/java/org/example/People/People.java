package org.example.People;

public abstract class People {
    private String name;
//    private Building location;

    public People(String name){
        this.name = name;
    }

//    public void goTo(Building destination){
//        this.location = destination
//    }

    public String getName(){
        return this.name;
    }

//    public Building getLocation(){
//        return this.location;
//    }
}
