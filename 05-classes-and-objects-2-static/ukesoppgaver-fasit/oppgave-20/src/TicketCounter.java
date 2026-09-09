// Reference solution for exercise 20: the class the exercise asks about. Kept here so the printed run in the
// Fasit can be checked against a real one.
public class TicketCounter {
    private static int ticketsIssued = 0;
    private int ticketNr;

    public TicketCounter() {
        ticketsIssued++;
        this.ticketNr = ticketsIssued;
    }

    public int getTicketNr() {
        return this.ticketNr;
    }

    public static int getTicketsIssued() {
        return ticketsIssued;
    }
}
