import static javax.swing.JOptionPane.*;

// Reference solution for exercise 50. Migrated from the archive solution;
// identifiers anglicised, and the loop corrected to read exactly 10
// numbers (the archive version read 11).
//
// Denne løsningen bruker den samme for-loopen som i oppgave 49, av samme
// grunn. Antallet er fast på 10, så første linje i for-loopen sier alt om
// hvordan loopen går. Ekstraarbeidet ligger i if-logikken, ikke i valget av
// loop. En while-loop virker også her. Ulempen er den samme som i oppgave
// 49. Koden for tellevariabelen blir delt på tre steder.
public class Main {
    public static void main(String[] args) {
        int number = 0;
        int largest = 0;
        int secondLargest = 0;

        for (int counter = 1; counter <= 10; counter++) {
            // Asks again until the input is a number, so a backup value
            // never takes part in the comparison.
            boolean isNumber = false;
            do {
                String input = showInputDialog("Skriv inn heltall nummer " + counter + ":");
                try {
                    number = Integer.parseInt(input);
                    isNumber = true;
                } catch (Exception e) {
                    showMessageDialog(null, "Du må skrive inn et heltall. Prøv igjen.");
                }
            } while (!isNumber);

            if (counter == 1 || number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (counter == 2 || number > secondLargest) {
                secondLargest = number;
            }
        }

        showMessageDialog(null, "Det største tallet er " + largest + "\n"
                + "Det nest største tallet er " + secondLargest);
    }
}
