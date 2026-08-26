import javax.swing.JOptionPane;

// Reference solution for exercise 8.
public class ProfileCard {
    public static void main(String[] args) {
        int ageYears = 21;
        float heightMeters = 1.75f;   // the f marks the value as a float
        double weightKilos = 68.5;
        char firstInitial = 'O';
        boolean hasDriversLicense = true;

        // \n gives a line break, so each piece of information gets its own line.
        String output = "Alder: " + ageYears
                + "\nHøyde: " + heightMeters
                + "\nVekt: " + weightKilos
                + "\nForbokstav: " + firstInitial
                + "\nFørerkort: " + hasDriversLicense;
        JOptionPane.showMessageDialog(null, output);
    }
}
