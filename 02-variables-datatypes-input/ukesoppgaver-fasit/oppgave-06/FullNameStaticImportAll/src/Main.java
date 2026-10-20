import static javax.swing.JOptionPane.*;

// Reference solution for exercise 6, version B.
public class Main {
    public static void main(String[] args) {
        // A static import on * brings in every method of JOptionPane, so the
        // class name can be left out of the calls below.
        String firstName = showInputDialog("Skriv inn fornavnet ditt");
        String lastName = showInputDialog("Skriv inn etternavnet ditt");

        String fullName = firstName + " " + lastName;
        showMessageDialog(null, "Det fullstendige navnet ditt er " + fullName);
    }
}
