public class Ticket {
    private int ticketNr;
    private static int nrOfTicketsPrinted = 0;

    public Ticket() {
        Ticket.nrOfTicketsPrinted ++;
        this.ticketNr = nrOfTicketsPrinted;
    }

    public static int getNrOfTicketsPrinted() {
        return Ticket.nrOfTicketsPrinted;
    }

}
