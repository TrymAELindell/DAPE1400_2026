import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 26. Migrated from the 2025 solution; comments
// translated. The valid-input flag is reset for every launch — in the 2025
// version it stayed true after the first launch, so invalid input on later
// launches slipped through with a stale countdown number.
public class RocketCountdownV4 {
    public static void main(String[] args) {
        int rocketsLaunched = 0;

        // The outer while loop runs one full launch per round, until the
        // user answers something other than "j".
        while (showInputDialog("Fortsett oppskytning? (j/n)").equals("j")) {
            int countFrom = 0;
            boolean inputIsValid = false;

            do {
                String userInput = showInputDialog("Start nedtelling fra:");
                try {
                    countFrom = Integer.parseInt(userInput);
                    if (countFrom > 0) {
                        inputIsValid = true;
                    } else {
                        showMessageDialog(null, "Tallet må være større enn 0. Prøv igjen.");
                    }
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Du må skrive inn et heltall. Prøv igjen.");
                }
            } while (!inputIsValid);

            for (int currentCount = countFrom; currentCount > 0; currentCount--) {
                System.out.println(currentCount);
            }
            System.out.println("Launch!");
            rocketsLaunched++;
        }

        System.out.println(rocketsLaunched + " raketter har blitt skutt opp");
    }
}
