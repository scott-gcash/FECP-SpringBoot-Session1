package org.example.modules;

import org.example.Animal.Animal;
import org.example.Building.Enclosure;
import org.example.People.Handlers;
import org.example.core.Zoo;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class HandlerModule {
    static Zoo zoo = Zoo.getInstance();
    private static final Scanner scanner = new Scanner(System.in);

    public static void start(){
        System.out.println("Enter your name (Handler): ");
        String name = scanner.nextLine();

        Optional<Handlers> handlers = zoo.getPeople().stream()
                .filter(b -> b instanceof Handlers && b.getName().equalsIgnoreCase(name))
                .map(b -> (Handlers) b).findFirst();

        if (handlers.isEmpty()){
            System.out.println("Handler does not exist.");
            return;
        }

        Handlers handler = handlers.get();
        Enclosure assignedEnclosure = handler.getAssignedEnclosure();

        List<Animal> assignedAnimals = assignedEnclosure.getAnimals();

        if(assignedAnimals.isEmpty()){
            System.out.printf("No Animals assigned to %s\n", name);
            return;
        }

        System.out.printf("Welcome, Handler %s\n", name);
        boolean handlerDuty = false;
        while (!handlerDuty){
            System.out.println("--- Animal Duty Menu ---");
            System.out.println("Animals Assigned to you:");
            int index = 1;

            for (Animal animal: assignedAnimals){
                System.out.printf("%d. %s\n", index, animal.getName());
                index++;
            }

            System.out.println("Choose animal number to interact with (0 to exit): ");
            int choice = scanner.nextInt();
            if (choice == 0){
                return;
            }
            Animal animalsName = assignedAnimals.get(choice-1);

            System.out.println("Choose action:");
            System.out.println("1. Feed "+ animalsName.getName());
            System.out.println("2. Exercise "+ animalsName.getName());
            System.out.println("3. Examine "+ animalsName.getName());
            System.out.print("Choose option: ");
            int animalActionChoice = scanner.nextInt();

            switch (animalActionChoice){
                case(1):
                    handler.feed(animalsName.getName());
                    break;
                case(2):
                    handler.exercise(animalsName.getName());
                    break;
                case(3):
                    handler.examine(animalsName);
                    break;
                case(0):
                    handlerDuty = true;
                    break;
            }
            scanner.nextLine();

        }

    }
}
