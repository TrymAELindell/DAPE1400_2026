import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

// Reference solution for exercise 25 (Del 3): read names until the user
// enters "ferdig", then print them alphabetically.
public class SortNamesUntilDone {

    public static void main(String[] args) {
        // An ArrayList with Collections.sort fits here: the number of
        // names is unknown until the user stops, and growing on demand is
        // the list's whole point. An array with Arrays.sort also works,
        // but its size must be picked before the first name arrives — a
        // guessed capacity plus a counter for how much of it is real,
        // which is exactly the bookkeeping the list removes.
        ArrayList<String> names = new ArrayList<>();

        String input = JOptionPane.showInputDialog("Skriv inn et navn (ferdig avslutter):");
        while (!input.equals("ferdig")) {
            names.add(input);
            input = JOptionPane.showInputDialog("Skriv inn et navn (ferdig avslutter):");
        }

        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
