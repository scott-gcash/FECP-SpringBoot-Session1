package org.example.modules;

import java.util.HashMap;
import java.util.Random;

public class Tickets {
    private static HashMap<String, String> ticketMap;

    //public Tickets(HashMap<String, String> ticketMap) {this.ticketMap = ticketMap;}

    public Tickets() {
        ticketMap = new HashMap<>();
    }

    public static HashMap<String, String> getTicketsMap() {return ticketMap;}

    public void setTicketsMap(HashMap<String, String> ticketsMap) {this.ticketMap = ticketsMap;}

    public String validTicketNumber() {
        String ticketNumber = createTicketNumber();
        while (ticketMap.containsKey(ticketNumber)) {
            ticketNumber = createTicketNumber();
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
        ticketMap.put(ticketNumber,name);
        System.out.println("Ticket Purchased!");
        System.out.println("Your ticket code is: ".concat(ticketNumber));
        System.out.println("[Ticket added to the system]");
    }

    public void calculateTicket(int age){
        if (age >= 60){
            System.out.println("You qualify for a SENIOR ticket.");
            System.out.println("Ticket price is Php50.00");
        } else if (age > 18){
            System.out.println("You will have a full price ADULT ticket.");
            System.out.println("Ticket price is Php150.00");
        } else if (age > 6){
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
