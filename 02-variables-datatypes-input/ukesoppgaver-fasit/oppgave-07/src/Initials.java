import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 7.
public class Initials {
    public static void main(String[] args) {
        // char values are written with single quotes; "O" would be a String.
        char firstInitial = 'O';
        char lastInitial = 'O';

        // The expression starts with a String, so + concatenates here instead
        // of adding the two character codes together.
        showMessageDialog(null, "Initialene mine er " + firstInitial + "." + lastInitial + ".");
    }
}
