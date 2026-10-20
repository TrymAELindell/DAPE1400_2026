import javax.swing.JOptionPane;

// Reference solution for exercise 31: reads a valid integer from the user.
public class UserInput {

    // Asks until the user enters a valid integer within [min, max].
    public static int readIntBetween(String prompt, int min, int max) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
                JOptionPane.showMessageDialog(null, "Tallet må være mellom " + min + " og " + max);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Du må skrive inn et heltall");
            }
        }
    }
}
