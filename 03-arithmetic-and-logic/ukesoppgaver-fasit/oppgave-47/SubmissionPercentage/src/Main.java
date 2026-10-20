import javax.swing.JOptionPane;

// Reference solution for exercise 47.
public class Main {
    public static void main(String[] args) {
        String deliveredInput = JOptionPane.showInputDialog("Hvor mange innleveringer har du levert?");

        int delivered;
        try {
            delivered = Integer.parseInt(deliveredInput);
        } catch (Exception e) {
            delivered = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall innleveringer er satt til 0");
        }
        int total = 12;

        // The two counts are read as int, because half an assignment cannot
        // be delivered. So the cast belongs in the division instead. It is
        // the percentage, not the count, that needs decimals. Declaring
        // delivered as a double, the module 02 way, would print the same
        // 75.0. But it would also let the program accept "9.5
        // innleveringer" without complaint.
        double percentage = (double) delivered / total * 100;

        JOptionPane.showMessageDialog(null, "Du har levert " + percentage
                + " % av innleveringene.");
    }
}
