import javax.swing.JOptionPane;

// Reference solution for exercise 49.
public class Main {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        String companionInput = JOptionPane.showInputDialog("Har du med en voksen? (ja/nei)");

        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — alderen er satt til 0");
        }
        boolean oldEnough = age >= 18;
        boolean hasAdult = companionInput.equals("ja");

        // The two ways in are alternatives, not requirements, so || joins
        // them into a single condition. Another way is one if for oldEnough
        // and a separate if for hasAdult. For an adult who has brought
        // someone, both branches would then run, and the program would
        // print the message twice.
        if (oldEnough || hasAdult) {
            JOptionPane.showMessageDialog(null, "Du slipper inn.");
        } else {
            JOptionPane.showMessageDialog(null, "Du slipper ikke inn.");
        }
    }
}
