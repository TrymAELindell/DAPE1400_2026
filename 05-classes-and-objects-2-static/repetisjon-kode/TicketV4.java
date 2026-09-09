public class TicketV4 {
    private int ticketNr; // field that belongs to each instance (object) of the class
    private static int nrOfTicketsPrinted = 0; // static field that belongs to the class and is shared across instances (objects)

    public TicketV4() {
        nrOfTicketsPrinted++; // increases the static field nrOfTicketsPrinted by 1
        this.ticketNr = nrOfTicketsPrinted; // copies the value of nrOfTicketsPrinted into this.ticketNr
    }
}
