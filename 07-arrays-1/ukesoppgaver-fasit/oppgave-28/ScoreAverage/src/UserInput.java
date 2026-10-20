import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 28. readNumber asks again until the text
// parses.
public class UserInput {

    public static int readNumber(String prompt) {
        while (true) {
            String input = showInputDialog(prompt);
            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                showMessageDialog(null, "«" + input + "» er ikke et tall. Prøv igjen.");
            }
        }
    }
}
