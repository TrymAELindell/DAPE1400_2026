// Reference solution for exercise 24 (Del 2): a ticket that is equal by its code.
public class Ticket {
    private String code;

    public Ticket(String code) {
        this.code = code;
    }

    public boolean equals(Object other) {
        if (other instanceof Ticket) {
            Ticket ticket = (Ticket) other;
            return code.equals(ticket.code);
        }
        return false;
    }
}
