import javax.swing.JOptionPane;

// Reference solution for exercise 49.
public class ConcertEntry {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        String companionInput = JOptionPane.showInputDialog("Har du med en voksen? (ja/nei)");

        int age = Integer.parseInt(ageInput);
        boolean oldEnough = age >= 18;
        boolean hasAdult = companionInput.equals("ja");

        // The two ways in are alternatives, not requirements, so || joins them
        // into a single condition. One if for the age and a separate if for
        // the companion would let both branches run for an adult who happens
        // to have brought someone, and the message would be printed twice.
        if (oldEnough || hasAdult) {
            JOptionPane.showMessageDialog(null, "Du slipper inn.");
        } else {
            JOptionPane.showMessageDialog(null, "Du slipper ikke inn.");
        }
    }
}
