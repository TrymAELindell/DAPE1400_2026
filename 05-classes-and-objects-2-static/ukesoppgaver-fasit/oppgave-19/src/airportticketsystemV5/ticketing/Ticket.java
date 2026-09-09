package airportticketsystemV5.ticketing;

// Reference solution for exercise 19.
public class Ticket {
    private String name;
    private String personNr;
    private String destination;
    private static int ticketsIssued = 0;
    private int ticketNumber;

    public Ticket(String name, String personNr, String destination) {
        this.name = name;
        this.personNr = personNr;
        this.destination = destination;

        ticketsIssued++;
        this.ticketNumber = ticketsIssued;
    }

    public void printTicketInfo() {
        System.out.println("\nBillettinformasjon");
        System.out.println("Navn: " + this.name);
        System.out.println("PersonNr: " + this.personNr);
        System.out.println("Destinasjon: " + this.destination);
    }

    public void setPassengerInfo(String name, String personNr) {
        this.name = name;
        this.personNr = personNr;
    }

    public String getDestination() {
        return this.destination;
    }

    public int getTicketNumber() {
        return this.ticketNumber;
    }

    public static int getTicketsIssued() {
        return ticketsIssued;
    }
}
