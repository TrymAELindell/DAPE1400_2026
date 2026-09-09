import static javax.swing.JOptionPane.*;

// Reference solution for exercise 50. Migrated from the archive solution;
// identifiers anglicised, and the loop corrected to read exactly 10
// numbers (the archive version read 11).
//
// Fasit comment (the choice): this solution uses the same for loop as in
// exercise 49, for the same reason: the count is fixed at 10, so the for
// header says everything about how the loop moves. The extra work is in
// the if logic, not in the loop choice. A while loop also works here.
// The disadvantage is the same as in exercise 49: the counter code is
// split over three places.
public class TwoLargestNumbers {
    public static void main(String[] args) {
        int number;
        int largest = 0;
        int secondLargest = 0;

        for (int counter = 1; counter <= 10; counter++) {
            String input = showInputDialog("Skriv inn heltall nummer " + counter + ":");
            number = Integer.parseInt(input);

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
