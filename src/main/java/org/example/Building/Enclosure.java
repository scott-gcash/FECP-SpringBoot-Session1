package org.example.Building;

import org.example.Animal.Animal;
import org.example.People.Handlers;

import java.util.ArrayList;

public class Enclosure extends Building{
    private String species;
    private ArrayList<Animal> animals = new ArrayList<>();
    private Handlers assignedHandler;

    public Enclosure(String species){
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimals(Animal animal){
        animals.add(animal);
    }
}
