import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 25. Migrated from the 2025 solution; comments
// translated, and the catch narrowed to NumberFormatException — the
// exception Integer.parseInt actually throws (module 02).
public class RocketCountdownV3 {
    public static void main(String[] args) {
        // countFrom starts at an invalid value, so the do-while below runs
        // until the user has supplied a valid countdown number.
        int countFrom = 0;

        // A do-while fits here: we must ask the user at least once, and we
        // keep asking as long as the input is invalid.
        do {
            String userInput = showInputDialog("Start nedtelling fra:");
            try {
                countFrom = Integer.parseInt(userInput);
                if (countFrom <= 0) {
                    // The input was a number, but not a valid one for a countdown.
                    showMessageDialog(null, "Tallet må være større enn 0. Prøv igjen.");
                }
            } catch (NumberFormatException e) {
                // The input was not a number at all.
                showMessageDialog(null, "Du må skrive inn et heltall. Prøv igjen.");
            }
        } while (countFrom <= 0);

        // Now we have a valid number, and we know exactly how many rounds
        // the countdown takes — so a for loop does the counting.
        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
