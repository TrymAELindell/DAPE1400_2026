import static javax.swing.JOptionPane.*;

// Reference solution for exercise 28. The series converges very slowly:
// about 10^10 terms are needed for 10 correct decimals, which is more
// than an int can count — hence long for the loop counter.
public class Main {
    public static void main(String[] args) {
        long numberOfTerms = 0;
        boolean isNumber = false;
        do {
            String input = showInputDialog("Hvor mange ledd av rekka skal brukes?");
            try {
                numberOfTerms = Long.parseLong(input);
                isNumber = true;
            } catch (Exception e) {
                showMessageDialog(null, "Du må skrive inn et heltall. Prøv igjen.");
            }
        } while (!isNumber);

        double pi = 0.0;
        double sign = 1.0; // +1 for the first term, then alternating
        for (long i = 0; i < numberOfTerms; i++) {
            pi += sign * 4.0 / (2 * i + 1);
            sign = -sign;
        }

        System.out.println("Pi beregnet med " + numberOfTerms + " ledd: " + pi);
        System.out.println("Pi med 12 desimaler:       3.141592653589");
    }
}
