import javax.swing.JOptionPane;

// Reference solution for exercise 47.
public class SubmissionPercentage {
    public static void main(String[] args) {
        String deliveredInput = JOptionPane.showInputDialog("Hvor mange innleveringer har du levert?");

        int delivered = Integer.parseInt(deliveredInput);
        int total = 12;

        // The two counts are read as int because half an assignment cannot be
        // delivered, so the cast belongs in the division instead - it is the
        // percentage, not the count, that needs decimals. Declaring delivered
        // as a double from module 02 would print the same 75.0, but it would
        // also let the program accept "9.5 innleveringer" without complaint.
        double percentage = (double) delivered / total * 100;

        JOptionPane.showMessageDialog(null, "Du har levert " + percentage
                + " % av innleveringene.");
    }
}
