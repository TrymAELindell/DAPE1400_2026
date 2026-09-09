import static javax.swing.JOptionPane.*;

// Reference solution for exercise 49. Migrated from the archive solution;
// identifiers anglicised. The first number read becomes the first value of
// largest, so the program also works when every number is negative
// (the archive solution started largest at 0).
//
// Fasit comment (the choice): this solution uses a for loop, because
// «10 numbers» is a count that is known before the loop starts. The for
// header holds all the counting, and the counter is also used in the
// prompt text. Another good solution is a while loop; it gives the same
// answer. The disadvantage: the counter code is split over three places,
// and you gain nothing, because the stop condition is already known.
public class LargestNumber {
    public static void main(String[] args) {
        int number;
        int largest = 0;

        for (int counter = 1; counter <= 10; counter++) {
            String input = showInputDialog("Skriv inn heltall nummer " + counter + ":");
            number = Integer.parseInt(input);
            if (counter == 1 || number > largest) {
                largest = number;
            }
        }

        showMessageDialog(null, "Det største tallet er " + largest);
    }
}
