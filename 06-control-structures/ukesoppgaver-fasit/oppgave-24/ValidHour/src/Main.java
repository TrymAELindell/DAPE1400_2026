import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 24.
//
// Dette er valideringsmønsteret fra kapitlet. Vi må spørre minst én gang, og
// vi spør igjen så lenge svaret er ugyldig.
public class Main {
    public static void main(String[] args) {
        int hour;
        do {
            String input = showInputDialog("Skriv inn et timetall (0-23):");
            try {
                hour = Integer.parseInt(input);
                if (hour < 0 || hour > 23) {
                    showMessageDialog(null, "Ugyldig timetall: " + hour + ". Prøv igjen.");
                }
            } catch (Exception e) {
                // -1 is not a valid hour, so the loop asks again.
                hour = -1;
                showMessageDialog(null, "Du må skrive inn et heltall. Prøv igjen.");
            }
        } while (hour < 0 || hour > 23);

        showMessageDialog(null, "Registrert time: " + hour);
    }
}
