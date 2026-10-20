import java.util.ArrayList;

// Reference solution for exercise 17 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. Den skriver ut 2 og Nora, fordi
// add(1, ...) flytter elementer bakover, set(0, ...) erstatter på plass og
// remove("Jonas") fjerner etter verdi.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Siri");
        names.add("Jonas");
        names.add(1, "Nora");     // [Siri, Nora, Jonas]
        names.set(0, "Emil");     // [Emil, Nora, Jonas]
        names.remove("Jonas");    // [Emil, Nora]

        System.out.println(names.size());
        System.out.println(names.get(1));
    }
}
