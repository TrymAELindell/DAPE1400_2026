import static javax.swing.JOptionPane.*;

// Reference solution for exercise 46. Migrated from the archive solution;
// identifiers anglicised. A trip length of 0 or less ends the input loop,
// and the terminating trip is not asked for a fuel amount.
//
// Fasit comment (the choice): this solution uses a while loop, with one
// read before the loop. The program reads a trip length, the loop tests
// it, and only a real trip gets the question about liters. Another good
// solution is a do-while loop, because the program must always ask at
// least once. The disadvantage: the final 0 then also goes through the
// loop body, so you need an extra if test to skip the liters question
// and to keep 0 out of the totals.
public class FuelConsumption {
    public static void main(String[] args) {
        double totalKm = 0;
        double totalLiters = 0;

        String kmInput = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0:");
        double km = Double.parseDouble(kmInput);

        while (km > 0) {
            String literInput = showInputDialog("Skriv inn antall liter som ble brukt på turen:");
            double liters = Double.parseDouble(literInput);

            totalKm += km;
            totalLiters += liters;

            kmInput = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0:");
            km = Double.parseDouble(kmInput);
        }

        // liters per 10 km = liters per mil
        double averagePerMil = totalLiters / totalKm * 10;
        showMessageDialog(null,
                "Gjennomsnittlig forbruk per mil er " + averagePerMil + " liter");
    }
}
