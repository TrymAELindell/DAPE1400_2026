import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 48. Reads the bun counts from the user.
public class UserInput {

    // Assumption: Halyna types whole numbers, as a note on paper holds
    // whole bun counts.
    public static int[] readWeek(String weekName, String[] days) {
        int[] sales = new int[days.length];
        for (int i = 0; i < sales.length; i++) {
            sales[i] = readNumber("Antall boller " + days[i] + " " + weekName + ":");
        }
        return sales;
    }

    // Asks again until the text parses.
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
