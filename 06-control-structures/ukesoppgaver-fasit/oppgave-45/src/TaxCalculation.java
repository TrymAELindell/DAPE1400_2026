import static javax.swing.JOptionPane.*;

// Reference solution for exercise 45. Migrated from the archive solution;
// identifiers anglicised, and the name is read as the exercise asks
// (the archive solution skipped it).
//
// Fasit comment (the choice): this solution uses a for loop over the
// three persons, because the code is the same for each person. Another
// solution is to write the same block three times. That also works, and
// that is what makes it tempting. The disadvantage: when the tax rule
// changes, you must change it in three places. If you forget one place,
// that copy keeps the old rule, and the program gives no warning.
public class TaxCalculation {
    public static void main(String[] args) {
        String output = "";

        for (int i = 1; i <= 3; i++) {
            String name = showInputDialog("Skriv inn navnet til person " + i + ":");
            String incomeInput = showInputDialog("Skriv inn inntekten til " + name + ":");
            double income = Double.parseDouble(incomeInput);

            double tax;
            if (income > 500_000) {
                // 30 % of the first 500 000, 50 % of the rest
                tax = 500_000 * 0.3 + (income - 500_000) * 0.5;
            } else {
                tax = income * 0.3;
            }

            output += name + ": inntekt " + income + " kr gir skatt på " + tax + " kr\n";
        }

        showMessageDialog(null, output);
    }
}
