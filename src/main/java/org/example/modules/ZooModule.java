package org.example.modules;

import org.example.Building.Enclosure;
import org.example.core.Zoo;
import java.util.*;

public class ZooModule {
    private static final Scanner scanner = new Scanner(System.in);;
    private static Zoo zoo = Zoo.getInstance();

    public void start(){
        if (zoo.getIsOpen()) {
            System.out.println("Zoo is closed");
            return;
        }

        System.out.println("Enter your ticket code to enter the zoo: ");
        String code = scanner.nextLine();

        if (code.equals(null)){
            System.out.println("Code does not exist");
            return;
        }

        int choice;
        boolean isInside = true;

        while(isInside) {
            System.out.println("What would you like to do?");
            System.out.println("1. Visit Enclosure");
            System.out.println("2. Visit Shop");
            System.out.println("3. Visit Hospital");
            System.out.println("4. Leave Zoo");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    exploreEnclosure();
                    break;
                case 2:
                    visitShop();
                    break;
                case 3:
                    visitHospital();
                    break;
                case 4:
                    leaveZoo();
                    isInside = false;
                    break;
            }
        }
    }

    public void exploreEnclosure(){
        List<Enclosure> enclosures = zoo.getBuilding().stream()
                        .filter(b -> b instanceof Enclosure)
                                .map(b -> (Enclosure) b)
                                        .toList();

        System.out.println("===Zoo Enclosure===");
        System.out.println("Choose Enclosure:");
        for(int i = 0; i < enclosures.size(); i++){
            Enclosure e = enclosures.get(i);
            System.out.printf("%d. %s (%d)\n", i+1, e.getSpecies(), e.getAnimals().size());
        }


    }

    public void visitShop(){

    }

    public void visitHospital(){

    }

    public void leaveZoo(){

    }
}
