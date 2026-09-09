// Reference solution for exercise 34: the snippet from the handout, runnable. "barn" and
// "student" share a case, separated by a comma; each arm executes a
// statement and returns nothing.
public class TicketPrices {
    public static void main(String[] args) {
        String ticketType = "student";
        switch (ticketType) {
            case "barn", "student" -> System.out.println("Billetten koster 44 kr");
            case "voksen" -> System.out.println("Billetten koster 81 kr");
            default -> System.out.println("Ukjent billettype");
        }
    }
}
