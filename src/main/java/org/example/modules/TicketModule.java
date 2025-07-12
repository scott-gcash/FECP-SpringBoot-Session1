package org.example.modules;

import java.util.Scanner;

public class TicketModule {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Tickets tickets = Tickets.getInstance();

        System.out.println("=== WELCOME TO THE ZOO TICKET SHOP ===");
        System.out.println("Visit Animal Enclosures (Elephant, Lion, Owl)");
        System.out.println("Buy snacks and drinks from our Shops");
        System.out.println("Listen to science lectures at the Hospital");
        System.out.println("Buy fun gifts at our Gift Shop");
        System.out.println();

        System.out.print("Would you like to buy a ticket? (yes/no): ");
        String buyTicketOption = scanner.next();
        if (buyTicketOption.equalsIgnoreCase("yes")){
            System.out.print("Enter your name: ");
            String name = scanner.next();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            if (age < 0) {
                System.out.println("Invalid Age, ticket was not purchased.");
                return;
            } else {
                tickets.calculateTicket(age);
            }

            System.out.print("\nProceed with purchase? (yes/no): ");
            String purchaseTicket = scanner.next();
            System.out.println();

            if(purchaseTicket.equalsIgnoreCase("yes")) {
                tickets.buyTicket(name);
            } else {
                System.out.println("Ticket was not purchased.");
            }
        } else {
            System.out.println("Ticket was not purchased.");
        }
    }
}
