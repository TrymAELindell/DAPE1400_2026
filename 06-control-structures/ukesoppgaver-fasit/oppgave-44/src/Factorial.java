import static javax.swing.JOptionPane.*;

// Reference solution for exercise 44. Migrated from the archive solution;
// identifiers anglicised. Starting the product at 1 and counting down
// also gives the correct answer 0! = 1 (the archive version printed 0).
//
// Fasit comment (the choice): this solution uses a for loop. The number
// of rounds is known as soon as the input is read: the factors are n,
// n-1, ..., 2. The for header shows the start value, the stop condition
// and the update on one line. Another good solution is a while loop. The
// disadvantage: the counter code is split over three places in the
// program, and the reader must find all three to see that the loop
// stops.
public class Factorial {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn et heltall:");
        int number = Integer.parseInt(input);

        int result = 1;
        for (int i = number; i > 1; i--) {
            result *= i;
        }

        showMessageDialog(null, number + "! er " + result);
    }
}
