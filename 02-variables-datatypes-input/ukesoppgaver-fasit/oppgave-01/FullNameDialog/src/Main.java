import javax.swing.JOptionPane;

// Reference solution for exercise 1.
public class Main {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Skriv inn fornavnet ditt");
        String lastName = JOptionPane.showInputDialog("Skriv inn etternavnet ditt");

        String fullName = firstName + " " + lastName;
        JOptionPane.showMessageDialog(null, "Det fullstendige navnet ditt er " + fullName);
    }
}
