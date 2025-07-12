package org.example.People;

public class Visitors extends People{

    private String ticketNumber;

    public Visitors(String name) {
        super(name);
    }

    public Visitors(String name, String ticketNumber) {
        super(name);
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {return ticketNumber;}

    public void setTicketNumber(String ticketNumber) {this.ticketNumber = ticketNumber;}
}
