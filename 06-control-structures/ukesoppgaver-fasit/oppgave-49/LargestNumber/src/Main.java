import static javax.swing.JOptionPane.*;

// Reference solution for exercise 49. Migrated from the archive solution;
// identifiers anglicised. The first number read becomes the first value of
// largest, so the program also works when every number is negative
// (the archive solution started largest at 0).
//
// Denne løsningen bruker en for-loop, fordi «10 tall» er et antall som er
// kjent før loopen starter. Første linje i for-loopen samler all tellingen,
// og tellevariabelen brukes også i ledeteksten. En annen god løsning er en
// while-loop. Den gir samme svar. Ulempen er at koden for tellevariabelen
// blir delt på tre steder. While-loopen gir ingenting ekstra her, fordi
// stoppbetingelsen allerede er kjent.
public class Main {
    public static void main(String[] args) {
        int number = 0;
        int largest = 0;

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
                largest = number;
            }
        }

        showMessageDialog(null, "Det største tallet er " + largest);
    }
}
