package org.example.core;

import org.example.Animal.Animal;
import org.example.Building.Building;
import org.example.Building.Enclosure;
import org.example.Building.Shop;
import org.example.People.People;

import java.util.*;

public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<People> people;
    private ArrayList<Building> buildings;

    private boolean isOpen;

    public static Zoo instance;

    public Zoo(){
        animals = new ArrayList<>();
        people = new ArrayList<>();
        buildings = new ArrayList<>();
        isOpen = false;
    }

    public static Zoo getInstance(){
        if (instance == null){
            instance = new Zoo();
        }
        return instance;
    }

    public Enclosure findEnclosureBySpecies(String species) {
        for (Building building : buildings) {
            if (building instanceof Enclosure) {
                Enclosure enclosure = (Enclosure) building;
                if (enclosure.getSpecies().equalsIgnoreCase(species)) {
                    return enclosure;
                }
            }
        }
        return null; // Return null if not found
    }
    public Shop findShopByShopType(String shopType) {
        for (Building building : buildings) {
            if (building instanceof Shop) {
                Shop shop = (Shop) building;
                if (shop.getShopType().equalsIgnoreCase(shopType)) {
                    return shop;
                }
            }
        }
        return null; // Return null if not found
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
        return buildings;
    }

    public void addAnimals(Animal animal){
        animals.add(animal);
    }

    public void addPeople(People person){
        people.add(person);
    }

    public void addBuildings(Building building){
        buildings.add(building);
    }
}