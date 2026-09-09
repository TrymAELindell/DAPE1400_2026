import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 54. Randi's kiosk tally: enter each sale during
// the evening, get the total, the number of sales and the largest single
// sale at closing time.
public class KioskSales {
    public static void main(String[] args) {
        // Assumption: sales are entered in whole kroner, and Randi types
        // "ferdig" when she closes — the brief does not say how the evening
        // ends.
        // Assumption: if the evening had no sales at all, the summary shows
        // zeros rather than a separate message.
        int salesCount = 0;
        int totalAmount = 0;
        int largestSale = 0;

        String input = showInputDialog("Skriv inn salget i kroner (eller ferdig):");
        while (!input.equals("ferdig")) {
            int sale = Integer.parseInt(input);

            salesCount++;
            totalAmount += sale;
            if (sale > largestSale) {
                largestSale = sale;
            }

            input = showInputDialog("Skriv inn salget i kroner (eller ferdig):");
        }

        showMessageDialog(null, "Antall salg: " + salesCount + "\n"
                + "Samlet beløp: " + totalAmount + " kr\n"
                + "Største salg: " + largestSale + " kr");
    }
}
