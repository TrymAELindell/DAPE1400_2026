// Reference solution for exercise 35.
//
// Koden fra oppgaven, gjort kjørbar. Gammel switch-syntaks uten break gir
// fall-through, så etter treffet på "medium" kjører hver grein under,
// også default.
public class Main {
    public static void main(String[] args) {
        String size = "medium";
        switch (size) {
            case "liten":
                System.out.println("2 dl kaffe");
            case "medium":
                System.out.println("3 dl kaffe");
            case "stor":
                System.out.println("5 dl kaffe");
            default:
                System.out.println("Ukjent størrelse");
        }
    }
}
