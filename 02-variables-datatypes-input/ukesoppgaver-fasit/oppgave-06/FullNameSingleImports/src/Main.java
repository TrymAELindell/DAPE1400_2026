// Brings in the input dialog method, and nothing else.
import static javax.swing.JOptionPane.showInputDialog;
// Brings in the message dialog method, and nothing else.
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 6, version C.
public class Main {
    public static void main(String[] args) {
        String firstName = showInputDialog("Skriv inn fornavnet ditt");
        String lastName = showInputDialog("Skriv inn etternavnet ditt");

        String fullName = firstName + " " + lastName;
        showMessageDialog(null, "Det fullstendige navnet ditt er " + fullName);
    }
}
