import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

// Reference solution for exercise 25 (Del 3): read names until the user
// enters "ferdig", then print them alphabetically.
public class Main {

    public static void main(String[] args) {
        // En ArrayList med Collections.sort passer her. Antallet navn er
        // ukjent til brukeren stopper, og en liste vokser når den trenger det.
        // En array med Arrays.sort virker også, men du må velge størrelsen før
        // det første navnet kommer. Programmet trenger da en gjettet størrelse,
        // pluss en teller for hvor mange plasser som er i bruk. Listen fjerner
        // akkurat det ekstraarbeidet.
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
