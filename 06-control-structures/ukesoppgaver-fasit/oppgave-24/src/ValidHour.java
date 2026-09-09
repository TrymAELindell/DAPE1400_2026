import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 24: the validation pattern from the chapter — we
// must ask at least once, and we keep asking while the answer is invalid.
public class ValidHour {
    public static void main(String[] args) {
        int hour;
        do {
            String input = showInputDialog("Skriv inn et timetall (0-23):");
            hour = Integer.parseInt(input);
            if (hour < 0 || hour > 23) {
                showMessageDialog(null, "Ugyldig timetall: " + hour + ". Prøv igjen.");
            }
        } while (hour < 0 || hour > 23);

        showMessageDialog(null, "Registrert time: " + hour);
    }
}
