import static javax.swing.JOptionPane.*;
import static pricing.Tax.*;

public class AirplaneTicketTaxCalculator {
    public static void main(String[] args) {
        // Extended compared to the live coding session: this version also takes user input.
        // Note how we can import the static methods of the Tax class the same way we
        // import the static methods of JOptionPane (line 1 and 2).

        // First we ask the user for the net ticket price
        String netTicketPriceInput = showInputDialog("Hva koster billetten før skatt og avgifter?");
        double netTicketPrice;
        try {
            netTicketPrice = Double.parseDouble(netTicketPriceInput);
        } catch (Exception e) {
            netTicketPrice = 0;
            showMessageDialog(null, "Pris må være et tall");
        }

        // Here the methods of the Tax class are used without any Tax object.
        // This is only possible because the methods are declared with the static
        // keyword (see the Tax class in the pricing package).
        double fullPrice = computeFullTicketPrice(netTicketPrice);
        double vat = computeVAT(netTicketPrice);
        double passengerFee = getPassengerFee();

        // Print the result of the tax calculation
        showMessageDialog(null, "Full pris på billetten er: " + fullPrice + "kr"
                + "\nNettopris: " + netTicketPrice
                + "\nMoms: " + vat
                + "\nPassasjeravgift: " + passengerFee
        );
    }
}
