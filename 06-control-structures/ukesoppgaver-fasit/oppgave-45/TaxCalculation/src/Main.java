import static javax.swing.JOptionPane.*;

// Reference solution for exercise 45. Migrated from the archive solution;
// identifiers anglicised, and the name is read as the exercise asks
// (the archive solution skipped it).
//
// Denne løsningen bruker en for-loop over de tre personene, fordi koden er
// den samme for hver person. En annen løsning er å skrive den samme blokken
// tre ganger. Det virker også, og derfor er det lett å velge. Ulempen
// kommer når skatteregelen endres. Da må du endre den på tre steder. Glemmer
// du ett sted, beholder den kopien den gamle regelen, og programmet gir
// ingen advarsel.
public class Main {
    public static void main(String[] args) {
        String output = "";

        for (int i = 1; i <= 3; i++) {
            String name = showInputDialog("Skriv inn navnet til person " + i + ":");
            String incomeInput = showInputDialog("Skriv inn inntekten til " + name + ":");
            double income;
            try {
                income = Double.parseDouble(incomeInput);
            } catch (Exception e) {
                income = 0;
                showMessageDialog(null, "Du skrev ikke inn et tall — inntekten er satt til 0");
            }

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
