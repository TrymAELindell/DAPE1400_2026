import static javax.swing.JOptionPane.*;

// Reference solution for exercise 44. Migrated from the archive solution;
// identifiers anglicised. Starting the product at 1 and counting down
// also gives the correct answer 0! = 1 (the archive version printed 0).
//
// Denne løsningen bruker en for-loop. Antallet runder er kjent så snart
// tallet er lest inn. Faktorene er number, number - 1, ..., 2. Første linje
// i for-loopen viser startverdien, stoppbetingelsen og oppdateringen samlet.
// En annen god løsning er en while-loop. Ulempen er at koden for
// tellevariabelen blir delt på tre steder i programmet. Leseren må finne
// alle tre for å se at loopen stopper.
public class Main {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn et heltall:");
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (Exception e) {
            number = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — tallet er satt til 0");
        }

        int result = 1;
        for (int i = number; i > 1; i--) {
            result *= i;
        }

        showMessageDialog(null, number + "! er " + result);
    }
}
