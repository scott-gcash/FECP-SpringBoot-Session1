package org.example.People;


import org.example.Animal.Animal;
import org.example.Building.Building;
import org.example.Building.Enclosure;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Handlers extends People{
    private Enclosure assignedEnclosure;

    public Handlers(String name) {
        super(name);
    }


    public Handlers(String name, Building location){
        super(name);
        assignedEnclosure = (Enclosure) location;
        this.goTo(location);
    }


    public void feed(String animal){
        System.out.println("I feed " + animal);
    }

    public void exercise(String animal){
        System.out.println("I exercise "+ animal);
    }

    public void examine(Animal animal){

//        List<Animal> examiningAnimal = new ArrayList<>();
        String animalsName= animal.getName();
        animal.setHealthy(false);
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = date.format(format);
        System.out.println(animal.getName() + " admitted at "+ formattedDate);
        // Admit the animals to sick list
    }

    public Enclosure getAssignedEnclosure(){
        return this.assignedEnclosure;
    }
}
