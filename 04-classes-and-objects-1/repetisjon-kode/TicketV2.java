// V2: the fields are private, so they can only be reached from inside the
// class. Everything that changes them now goes through a method that decides
// what is allowed.
public class TicketV2 {
    private String name;
    private String personNr;
    private String destination;

    public TicketV2(String name, String personNr, String destination) {
        // A Norwegian person number always has 11 digits. The class checks
        // its own data rather than trusting the caller.
        if (personNr.length() == 11) {
            this.name = name;
            this.personNr = personNr;
            this.destination = destination;
        } else {
            System.out.println("Advarsel: personnummeret hadde feil lengde. Billetten ble ikke opprettet.");
        }
    }

    // Name and person number belong together, so they are changed together.
    // There is no way to change only one of them.
    public void setPassengerInfo(String name, String personNr) {
        if (personNr.length() == 11) {
            this.name = name;
            this.personNr = personNr;
        } else {
            System.out.println("Advarsel: personnummeret hadde feil lengde. Passasjerinformasjonen ble ikke endret.");
        }
    }

    // A getter with no matching setter makes the field read-only from the
    // outside: a ticket's destination cannot change once the ticket exists.
    public String getDestination() {
        return this.destination;
    }

    public void printTicketInfo() {
        System.out.println("\nBillett");
        System.out.println("Navn: " + this.name);
        System.out.println("PersonNr: " + this.personNr);
        System.out.println("Destinasjon: " + this.destination);
    }
}
