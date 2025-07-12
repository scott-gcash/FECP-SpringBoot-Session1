package org.example.Building;

import org.example.Animal.Animal;

import java.util.ArrayList;

public class Hospital extends Building{
    private ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}
