package org.example;

import org.example.modules.TicketModule;
import org.example.modules.Tickets;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tickets tickets = new Tickets();
        TicketModule.startTicket(tickets);
    }
}