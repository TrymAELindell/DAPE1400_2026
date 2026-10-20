import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 40.
//
// Koden fra oppgaven, gjort kjørbar. Loopen leser en vekt og spør igjen til
// svaret er mellom 0,1 og 20 kg, som i valideringsmønsteret fra kapitlet.
public class Main {
    public static void main(String[] args) {
        double weight;
        do {
            String input = showInputDialog("Skriv inn vekta i kg (0,1–20):");
            try {
                weight = Double.parseDouble(input);
            } catch (Exception e) {
                // 0 is not a valid weight, so the loop asks again.
                weight = 0;
                showMessageDialog(null, "Du må skrive inn et tall. Prøv igjen.");
            }
        } while (weight < 0.1 || weight > 20);

        System.out.println("Registrert vekt: " + weight + " kg");
    }
}
