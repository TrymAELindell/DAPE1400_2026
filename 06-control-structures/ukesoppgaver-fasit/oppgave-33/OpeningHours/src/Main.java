// Reference solution for exercise 33.
//
// Koden fra oppgaven, gjort kjørbar. Switch-uttrykket returnerer verdien til
// casen som passer, og default brukes bare når ingen case passer.
public class Main {
    public static void main(String[] args) {
        String day = "lørdag";
        int openingHour = switch (day) {
            case "søndag" -> 12;
            case "lørdag" -> 10;
            default -> 8;
        };
        System.out.println("Butikken åpner klokka " + openingHour);
    }
}
