package pl.coderslab.Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketMachine {

    public static void main(String[] args) {
        Ticket tChild = new Ticket(5, Ticket.TicketType.CHILD);
        Ticket tNormal = new Ticket(10, Ticket.TicketType.NORMAL);
        Ticket tStudent = new Ticket(7, Ticket.TicketType.STUDENT);
        Ticket tSenior = new Ticket(6, Ticket.TicketType.SENIOR);

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(tChild);
        tickets.add(tNormal);
        tickets.add(tStudent);
        tickets.add(tSenior);

        System.out.println("Welcome to the Ticket Machine. Input ticket type to see the price.");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toUpperCase();

        for (Ticket ticket : tickets) {
            if (input.equals(ticket.getTicketType().toString())) {
                TicketMachine machine = new TicketMachine();
                System.out.println(machine.calculatePrice(ticket));
            }
        }

    }

    public int calculatePrice(Ticket ticket) {
        return ticket.getPrice();
    }
}
