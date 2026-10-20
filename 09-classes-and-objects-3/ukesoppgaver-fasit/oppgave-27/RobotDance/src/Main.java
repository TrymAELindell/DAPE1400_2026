// Reference solution for exercise 27 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. Java velger variant av dance ut fra
// argumentene i hvert kall.
public class Main {
    public static void main(String[] args) {
        Robot rusty = new Robot("Rusty");
        rusty.dance(3);
        rusty.dance("tango");
        rusty.dance();
        rusty.dance("vals", 2);
    }
}
