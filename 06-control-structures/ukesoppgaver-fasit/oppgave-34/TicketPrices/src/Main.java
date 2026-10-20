// Reference solution for exercise 34.
//
// Koden fra oppgaven, gjort kjørbar. "barn" og "student" deler én case,
// skilt med komma, og hver grein utfører en setning uten å returnere noe.
public class Main {
    public static void main(String[] args) {
        String ticketType = "student";
        switch (ticketType) {
            case "barn", "student" -> System.out.println("Billetten koster 44 kr");
            case "voksen" -> System.out.println("Billetten koster 81 kr");
            default -> System.out.println("Ukjent billettype");
        }
    }
}
