// Reference solution for exercise 33 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. Begge utskriftene kaller toString
// automatisk.
public class Main {
    public static void main(String[] args) {
        Flight bergenFlight = new Flight("DY604", "Bergen", 25);
        Flight tromsoFlight = new Flight("SK4412", "Tromsø", 0);

        System.out.println(bergenFlight);
        System.out.println("Neste avgang: " + tromsoFlight);
    }
}
