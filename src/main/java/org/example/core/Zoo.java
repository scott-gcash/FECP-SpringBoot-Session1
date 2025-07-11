package org.example.core;

import org.example.Zoo.Animal.*;

import java.util.*;

public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<People> people;
    private ArrayList<Building> building;

    private boolean isOpen;

    private Zoo(){
        animals = new ArrayList<>();
        people = new ArrayList<>();
        building = new ArrayList<>();
        isOpen = false;
    }

    public void openZoo(){
        if (isOpen){
            System.out.println("Zoo is already open");
            return;
        }
        isOpen = true;
        System.out.println("Zoo is now open");
    }

    public void closeZoo(){
        if (!isOpen){
            System.out.println("Zoo is already closed");
            return;
        }
        isOpen = false;
        System.out.println("Zoo is now closed");
    }

    public boolean getIsOpen(){
        return this.isOpen;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    public ArrayList<Building> getBuilding() {
        return building;
    }

    public void addAnimals(Animal animal){
        animals.add(animal);
    }

    public void addPeople(Animal animal){
        animals.add(animal);
    }

    public void addBuildings(Animal animal){
        animals.add(animal);
    }
}
