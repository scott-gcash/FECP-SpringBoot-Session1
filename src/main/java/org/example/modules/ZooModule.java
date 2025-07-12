package org.example.modules;

import org.example.Animal.Animal;
import org.example.Building.Enclosure;
import org.example.Building.Shop;
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

        // To do: add implementation for adding the validation if code is in hashmap of tickets
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
        int choice;

        List<Enclosure> enclosures = zoo.getBuilding().stream()
                        .filter(b -> b instanceof Enclosure)
                                .map(b -> (Enclosure) b)
                                        .toList();

        System.out.println("===Zoo Enclosure===");
        System.out.println("Choose Enclosure:");
        // To do: Handler if enclosure is empty
        for(int i = 0; i < enclosures.size(); i++){
            Enclosure e = enclosures.get(i);
            System.out.printf("%d. %s (%d)\n", i+1, e.getSpecies(), e.getAnimals().size());
        }

        choice = scanner.nextInt();
        scanner.nextLine();
        // To do: Checker if choice is not in choices

        Enclosure selected = enclosures.get(choice-1);

        System.out.printf("Animals in %s enclosure\n", selected.getSpecies());
        List<Animal> animals = selected.getAnimals();
        int j = 0;
        // To do: Handler if animals is empty
        for (Animal animal: animals){
            System.out.printf("%d. %s - %s\n", j+1, animal.getName(), animal.getSpecies());
            j++;
        }

        int choiceAnimal;

        System.out.print("Choose an animal: ");
        choiceAnimal = scanner.nextInt();
        scanner.nextLine();

        Animal selectedAnimal = animals.get(choiceAnimal-1);

        System.out.printf("Would you like to feed %s? (yes/no)", selectedAnimal.getName());
        String feedChoice = scanner.nextLine();
        // To do: Checker if choice is not in choices

        if (feedChoice.equals("yes")){
            selectedAnimal.eat();
            selectedAnimal.makeSound();
        }
    }

    public void visitShop(){
        int choice;

        List<Shop> shops = zoo.getBuilding().stream()
                .filter(b -> b instanceof Shop)
                        .map(b -> (Shop)b)
                                .toList();

        if (shops.isEmpty()){
            System.out.println("There no shops open in the moment.");
            return;
        }

        double total = 0;
        int index = 1;
        HashMap<String, Double> cart = new HashMap<>();
        HashMap<Integer, String> productName = new HashMap<>();
        HashMap<Integer, Double> productPrice = new HashMap<>();

        System.out.println("=== Zoo Shop ===");
        System.out.println("Available Products:");

        for (Shop shop: shops){
            if(!shop.hasProducts()) continue;

            for(Map.Entry<String, Double> product : shop.getProducts().entrySet()){
                productName.put(index,product.getKey());
                productPrice.put(index,product.getValue());
                System.out.printf("%d. %s - ₱%.2f\n", index, product.getKey(), product.getValue());
                index++;
            }
        }

        if(productName.isEmpty() || productPrice.isEmpty()) {
            System.out.println("No Products on any Shop.");
            return;
        }

        boolean isExit = false;

        do{
            String isCheckout;

            System.out.print("Enter the number of items you want to buy: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 0 || choice > productName.size()){
                System.out.println("Invalid Input. Try again");
                return;
            }

            if(productName.containsKey(choice) || productPrice.containsKey(choice)){
                String product = productName.get(choice);
                double price = productPrice.get(choice);
                cart.put(product, price);
                total += price;
            }

            System.out.println("Selected: ");
            for (Map.Entry<String, Double> product: cart.entrySet()){
                System.out.printf("%s (₱%.2f)\n", product.getKey(), product.getValue());
            }
            System.out.printf("Total: ₱%.2f\n", total);

            System.out.println("Proceed to checkout? (yes/no)");
            isCheckout = scanner.nextLine();

            if (isCheckout.equals("yes")){
                System.out.println("Payment Successful!");
                System.out.println("Receipt:");
                for (Map.Entry<String, Double> product: cart.entrySet()){
                    System.out.printf("- %s: ₱%.2f\n", product.getKey(), product.getValue());
                }

                System.out.printf("Total Paid: ₱%.2f\n", total);
                isExit = true;
            }
        }while(!isExit);

    }

    public void visitHospital(){

    }

    public void leaveZoo(){

    }
}
