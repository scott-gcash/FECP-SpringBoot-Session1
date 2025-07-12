package org.example.modules;

import org.example.People.Visitors;
import org.example.core.Zoo;

import java.util.List;
import java.util.Random;


public class Tickets {
    private static Zoo zoo = Zoo.getInstance();

    public static Tickets instance;

    public static Tickets getInstance(){
        if (instance == null){
            instance = new Tickets();
        }
        return instance;
    }

    public String validTicketNumber() {
        String ticketNumber = createTicketNumber();

        List<Visitors> visitors = zoo.getPeople().stream()
                .filter(v -> v instanceof Visitors)
                .map(v -> (Visitors) v)
                .toList();

        for (Visitors v : visitors) {
            if (v.getTicketNumber().equalsIgnoreCase(ticketNumber)) {
                ticketNumber = createTicketNumber();
            }
        }
        return ticketNumber;
    }

    public String createTicketNumber(){
        Random random = new Random();
        String ticketNumber = "ZOO-";
        for (int i = 0; i < 6; i++) {
            int randomNum = random.nextInt(10);
            ticketNumber = ticketNumber.concat(Integer.toString(randomNum));
        }
        return ticketNumber;
    }

    public void buyTicket(String name){
        String ticketNumber = validTicketNumber();
        zoo.addPeople(new Visitors(name,ticketNumber));
        System.out.println("Ticket Purchased!");
        System.out.println("Your ticket code is: ".concat(ticketNumber));
        System.out.println("[Ticket added to the system]");
    }

    public void calculateTicket(int age){
        if (age >= 60){
            System.out.println("You qualify for a SENIOR ticket.");
            System.out.println("Ticket price is Php50.00");
        } else if (age >= 18){
            System.out.println("You will have a full price ADULT ticket.");
            System.out.println("Ticket price is Php150.00");
        } else if (age >= 6){
            System.out.println("You qualify for a STUDENT ticket.");
            System.out.println("Ticket price is Php75.00");
        } else if (age >= 0) {
            System.out.println("You will have free admission.");
            System.out.println("Ticket price is Free");
        } else {
            System.out.println("Invalid Age.");
        }
    }
}
