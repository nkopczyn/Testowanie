package pl.coderslab.Enum;

public class Ticket {

    public enum TicketType {
        NORMAL, STUDENT, SENIOR, CHILD
    }

    private int price;
    private TicketType ticketType;

    public Ticket(int price, TicketType ticketType) {
        this.price = price;
        this.ticketType = ticketType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }
}
