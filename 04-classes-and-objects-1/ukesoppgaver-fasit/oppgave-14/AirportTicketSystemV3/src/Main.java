import javax.swing.JOptionPane;

// Reference solution for exercises 14-17 - the program that drives TicketV3.
// The flow mirrors AirportTicketSystemV2 from the lecture code, with the
// birth date line (exercise 16) and the boarding check (exercise 17) added.
public class Main {
    public static void main(String[] args) {
        TicketV3 ticket1 = new TicketV3("Trym", "24019189765", "Svalbard");
        ticket1.printTicketInfo();

        // Trym falls ill, so Kristian has to stand in.
        ticket1.setPassengerInfo("Kristian", "01107012345");
        ticket1.printTicketInfo();

        String destination = ticket1.getDestination();
        System.out.println("\nBilletten går til: " + destination);

        // Exercise 16: the birth date of the passenger on the ticket.
        System.out.println("Passasjeren er født " + ticket1.getBirthDate());

        // Exercise 17: the gate check. The unmasked number never leaves the
        // class - the comparison happens inside checkPersonNr.
        String passportPersonNr = JOptionPane.showInputDialog(
                "Velkommen til innsjekken. Legg inn personnummeret fra passet:");
        boolean personNrIsCorrect = ticket1.checkPersonNr(passportPersonNr);

        if (personNrIsCorrect) {
            System.out.println("Velkommen om bord!");
        } else {
            System.out.println("Tilkall PST!");
        }
    }
}
