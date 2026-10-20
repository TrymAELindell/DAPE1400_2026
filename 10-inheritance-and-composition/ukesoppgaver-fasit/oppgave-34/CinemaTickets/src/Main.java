import java.util.ArrayList;

// Reference solution for exercise 34 (Del 3): the receipt for five tickets.
public class Main {
    public static void main(String[] args) {
        ArrayList<Ticket> soldTickets = new ArrayList<>();
        soldTickets.add(new Ticket("Ordinær", 140));
        soldTickets.add(new Ticket("Honnør", 70));
        soldTickets.add(new Ticket("Ordinær", 140));
        soldTickets.add(new Ticket("Ordinær", 140));
        soldTickets.add(new Ticket("Honnør", 70));

        int total = 0;
        for (Ticket ticket : soldTickets) {
            System.out.println(ticket);
            total += ticket.getPrice();
        }
        System.out.println("Til sammen: " + total + " kr");
    }
}
