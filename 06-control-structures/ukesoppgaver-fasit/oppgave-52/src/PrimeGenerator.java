import static javax.swing.JOptionPane.*;

// Reference solution for exercise 52. The inner while loop stops as soon as
// a divisor is found, expressed in the loop condition itself — break in
// loops is not introduced until module 07.
//
// Fasit comment (the choice): this solution uses a for loop outside and
// a while loop inside. The candidates 2..upperLimit are a known count,
// so a for loop fits there. The divisor search is different: it should
// stop as soon as a divisor is found, and the while condition can say
// that. Nested for loops also work. The disadvantage is the same
// early-stop problem as in exercise 51: without break (module 07), the
// found-flag must go into the for header's condition instead.
public class PrimeGenerator {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv ut alle primtall opp til:");
        int upperLimit = Integer.parseInt(input);

        String output = "";
        for (int candidate = 2; candidate <= upperLimit; candidate++) {
            boolean divisorFound = false;
            int divisor = 2;
            while (divisor < candidate && !divisorFound) {
                if (candidate % divisor == 0) {
                    divisorFound = true;
                }
                divisor++;
            }
            if (!divisorFound) {
                output += candidate + " ";
            }
        }

        showMessageDialog(null, "Primtall opp til " + upperLimit + ":\n" + output);
    }
}
