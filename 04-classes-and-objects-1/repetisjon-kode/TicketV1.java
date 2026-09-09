// V1: the three values are now fields of one class, and the constructor
// forces all three to be supplied. The fields are still reachable from the
// outside -- that is the problem V2 solves.
public class TicketV1 {
    String name;
    String personNr;
    String destination;

    public TicketV1(String name, String personNr, String destination) {
        this.name = name;
        this.personNr = personNr;
        this.destination = destination;
    }

    public void printTicketInfo() {
        System.out.println("\nBillett");
        System.out.println("Navn: " + this.name);
        System.out.println("PersonNr: " + this.personNr);
        System.out.println("Destinasjon: " + this.destination);
    }
}
