import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 28. Dialog-based, so it is checked by hand.
// readNumber asks again until the text parses.
public class ScoreAverage {

    public static int readNumber(String prompt) {
        while (true) {
            String input = showInputDialog(prompt);
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                showMessageDialog(null, "«" + input + "» er ikke et tall. Prøv igjen.");
            }
        }
    }

    public static void main(String[] args) {
        int count = readNumber("Hvor mange poengsummer skal registreres?");

        int[] scores = new int[count];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = readNumber("Skriv inn poengsum nummer " + (i + 1) + ":");
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        showMessageDialog(null,
                "Gjennomsnittet av " + scores.length + " poengsummer er " + average);
    }
}
