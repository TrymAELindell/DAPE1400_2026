import javax.swing.JOptionPane;

// Reference solution for exercise 30: the corrected program. The original
// did not crash, but it told the user they could bake 0.0 loaves without
// saying why - it failed silently.
public class Main {
    public static void main(String[] args) {
        String flourInput = JOptionPane.showInputDialog("Hvor mye mel har du (dl)?");

        double flourDl;
        try {
            flourDl = Double.parseDouble(flourInput);
        } catch (Exception e) {
            flourDl = 0;
            // The backup code now says what went wrong.
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall");
        }

        double numberOfLoaves = flourDl / 2.5;
        JOptionPane.showMessageDialog(null, "Du kan lage " + numberOfLoaves + " brød!");
    }
}
