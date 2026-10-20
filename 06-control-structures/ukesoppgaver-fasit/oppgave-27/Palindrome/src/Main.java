import static javax.swing.JOptionPane.*;

// Reference solution for exercise 27. Migrated from the archive solution;
// identifiers anglicised, and the upper bound corrected to 99 999
// (the archive version accepted the six-digit number 100 000).
public class Main {
    public static void main(String[] args) {
        int number;
        do {
            String input = showInputDialog("Skriv inn et femsifret heltall:");
            try {
                number = Integer.parseInt(input);
            } catch (Exception e) {
                // 0 does not have five digits, so the loop asks again.
                number = 0;
                showMessageDialog(null, "Du må skrive inn et heltall. Prøv igjen.");
            }
        } while (number < 10_000 || number > 99_999);

        // Pick out the five digits with integer division and modulus.
        int digit1 = number / 10_000;        // ten-thousands
        int digit2 = number / 1_000 % 10;    // thousands
        int digit4 = number / 10 % 10;       // tens
        int digit5 = number % 10;            // ones
        // The middle digit always equals itself, so it is not needed.

        if (digit1 == digit5 && digit2 == digit4) {
            showMessageDialog(null, number + " er et palindrom");
        } else {
            showMessageDialog(null, number + " er IKKE et palindrom");
        }
    }
}
