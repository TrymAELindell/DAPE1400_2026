// Reference solution for exercise 29.
//
// Koden fra oppgaven, gjort kjørbar. Loopen teller ned i steg på 2, og 0
// skrives aldri ut, fordi betingelsen i > 0 da er usann.
public class Main {
    public static void main(String[] args) {
        int i = 6;
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println("Ferdig!");
    }
}
