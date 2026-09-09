import static javax.swing.JOptionPane.*;

// Reference solution for exercise 51.
//
// Fasit comment (the choice): this solution uses a while loop, because
// the loop condition can name both reasons to stop: there are no more
// divisors to test, or a divisor was found. Another good solution is a
// for loop over the divisors. The disadvantage is the early stop: break
// in loops comes first in module 07, so a for loop must either keep
// running to the end after a divisor is found, or put the same
// found-flag into the for header's condition. The while loop shows that
// flag directly.
public class PrimeChecker {
    public static void main(String[] args) {
        String input = showInputDialog("Hvilket tall skal sjekkes?");
        int number = Integer.parseInt(input);

        boolean divisorFound = false;
        int divisor = 2;
        while (divisor < number && !divisorFound) {
            if (number % divisor == 0) {
                divisorFound = true;
            }
            divisor++;
        }

        if (number >= 2 && !divisorFound) {
            showMessageDialog(null, number + " er et primtall");
        } else {
            showMessageDialog(null, number + " er ikke et primtall");
        }
    }
}
