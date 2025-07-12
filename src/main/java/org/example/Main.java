package org.example;

import org.example.Animal.Elephant;
import org.example.Animal.Lion;
import org.example.Animal.Parrot;
import org.example.Building.Building;
import org.example.Building.Enclosure;
import org.example.Building.Hospital;
import org.example.Building.Shop;
import org.example.core.Zoo;
import org.example.modules.AdminModule;
import org.example.modules.TicketModule;
import org.example.modules.Tickets;
import org.example.modules.ZooModule;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ZooModule ZooModule = new ZooModule();
        Zoo zoo = Zoo.getInstance();

        // Instantiate Animals
        Lion simba = new Lion("Simba");
        Elephant dumbo = new Elephant("Dumbo");
        Parrot parry = new Parrot("Parry");
        zoo.addAnimals(simba);
        zoo.addAnimals(dumbo);
        zoo.addAnimals(parry);

        // Instantiate Buildings
        Enclosure pachydermEnclosure = new Enclosure("Pachyderm");
        Enclosure birdEnclosure = new Enclosure("Bird");
        Enclosure felineEnclosure = new Enclosure("Feline");
        zoo.addBuildings(new Hospital());
        zoo.addBuildings(pachydermEnclosure);
        zoo.addBuildings(birdEnclosure);
        zoo.addBuildings(felineEnclosure);

        //To do: add classes per shop building
        Shop gifts = new Shop();
        Shop food = new Shop();
        Shop drinks = new Shop();
        zoo.addBuildings(gifts);
        zoo.addBuildings(food);
        zoo.addBuildings(drinks);
        drinks.addProducts("Soft Drinks", 30.0);
        food.addProducts("Popcorn", 50.0);
        gifts.addProducts("Plush Toy", 120.0);
        gifts.addProducts("Key Chain", 40.0);


        pachydermEnclosure.addAnimals(dumbo);
        birdEnclosure.addAnimals(parry);
        felineEnclosure.addAnimals(simba);

        int choice;
        boolean isExit = false;

        do {
            System.out.println("Welcome to the Zoo Management System");
            System.out.println("1. Admin Module");
            System.out.println("2. Ticket Module");
            System.out.println("3. Zoo Module");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
          
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> AdminModule.start();
                case 2 -> {
                    Tickets tickets = new Tickets();
                    TicketModule.startTicket(tickets);
                }
                case 3 -> ZooModule.start();
                default -> {
                    System.out.println("Exiting Zoo Module...");
                    isExit = true;
                }
            }
        }while(!isExit);

    }
}