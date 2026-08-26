import javax.swing.JOptionPane;

// Reference solution for exercise 2.
public class FullNameWithAge {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Skriv inn fornavnet ditt");
        String lastName = JOptionPane.showInputDialog("Skriv inn etternavnet ditt");
        // The age is only shown, never calculated with, so keeping it as a
        // String is fine here. Exercise 6 shows the conversion to int.
        String age = JOptionPane.showInputDialog("Skriv inn alderen din");

        String fullName = firstName + " " + lastName;
        JOptionPane.showMessageDialog(null, "Alderen til " + fullName + " er " + age + " år.");
    }
}
