// Reference solution for exercise 20: the run the exercise asks about.
public class Main {
    public static void main(String[] args) {
        TicketCounter first = new TicketCounter();
        TicketCounter second = new TicketCounter();
        TicketCounter third = new TicketCounter();

        System.out.println(first.getTicketNr());
        System.out.println(second.getTicketNr());
        System.out.println(third.getTicketNr());
        System.out.println(TicketCounter.getTicketsIssued());
    }
}
