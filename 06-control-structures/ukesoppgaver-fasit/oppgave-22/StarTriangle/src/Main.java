import static javax.swing.JOptionPane.*;

// Reference solution for exercise 22. Migrated from the archive solution;
// identifiers anglicised, and the loop bounds corrected so line i has
// exactly i stars (the archive version printed an empty first line).
public class Main {
    public static void main(String[] args) {
        String input = showInputDialog("Hvor mange stjerner skal grunnlinja ha?");
        int baseWidth;
        try {
            baseWidth = Integer.parseInt(input);
        } catch (Exception e) {
            baseWidth = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — grunnlinja er satt til 0");
        }

        String output = "";
        for (int i = 1; i <= baseWidth; i++) {
            for (int j = 1; j <= i; j++) {
                output += "*";
            }
            output += "\n";
        }

        showMessageDialog(null, output);
    }
}
