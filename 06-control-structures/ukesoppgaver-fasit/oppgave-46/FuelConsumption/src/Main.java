import static javax.swing.JOptionPane.*;

// Reference solution for exercise 46. Migrated from the archive solution;
// identifiers anglicised. A trip length of 0 or less ends the input loop,
// and the terminating trip is not asked for a fuel amount.
//
// Denne løsningen bruker en while-loop, med én innlesing før loopen.
// Programmet leser lengden på en tur, loopen tester den, og bare en ekte tur
// får spørsmålet om liter. En annen god løsning er en do-while-loop, fordi
// programmet alltid må spørre minst én gang. Ulempen er at den avsluttende
// 0 da også går gjennom loopens blokk. Du trenger en ekstra if-test for å
// hoppe over spørsmålet om liter og for å holde 0 utenfor summene.
public class Main {
    public static void main(String[] args) {
        double totalKm = 0;
        double totalLiters = 0;

        String kmInput = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0:");
        double km;
        try {
            km = Double.parseDouble(kmInput);
        } catch (Exception e) {
            km = 0;
            showMessageDialog(null, "Du skrev ikke inn et tall — lengden er satt til 0, og innlesingen stopper");
        }

        while (km > 0) {
            String literInput = showInputDialog("Skriv inn antall liter som ble brukt på turen:");
            double liters;
            try {
                liters = Double.parseDouble(literInput);
            } catch (Exception e) {
                liters = 0;
                showMessageDialog(null, "Du skrev ikke inn et tall — literantallet er satt til 0");
            }

            totalKm += km;
            totalLiters += liters;

            kmInput = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0:");
            try {
                km = Double.parseDouble(kmInput);
            } catch (Exception e) {
                km = 0;
                showMessageDialog(null, "Du skrev ikke inn et tall — lengden er satt til 0, og innlesingen stopper");
            }
        }

        // liters per 10 km = liters per mil
        double averagePerMil = totalLiters / totalKm * 10;
        showMessageDialog(null,
                "Gjennomsnittlig forbruk per mil er " + averagePerMil + " liter");
    }
}
