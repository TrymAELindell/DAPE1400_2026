import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 25. Migrated from the 2025 solution; comments
// translated.
public class Main {
    public static void main(String[] args) {
        // countFrom starts at an invalid value, so the do-while below runs
        // until the user has supplied a valid countdown number.
        int countFrom = 0;

        // En do-while-loop passer her. Vi må spørre brukeren minst én gang, og
        // vi spør igjen så lenge svaret er ugyldig.
        do {
            String userInput = showInputDialog("Start nedtelling fra:");
            try {
                countFrom = Integer.parseInt(userInput);
                if (countFrom <= 0) {
                    // The input was a number, but not a valid one for a countdown.
                    showMessageDialog(null, "Tallet må være større enn 0. Prøv igjen.");
                }
            } catch (Exception e) {
                // The input was not a number at all.
                showMessageDialog(null, "Du må skrive inn et heltall. Prøv igjen.");
            }
        } while (countFrom <= 0);

        // Nå har vi et gyldig tall, og vi vet nøyaktig hvor mange runder
        // nedtellingen tar. Derfor gjør en for-loop tellingen.
        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
