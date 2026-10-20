import static pricing.Tax.computeVAT;
import static pricing.Tax.getPassengerFee;

// Reference solution for exercise 17. With a static import the methods are called
// without the class name in front. The output is identical to
// PricingMain - only the way the names are reached has changed.
public class Main {
    public static void main(String[] args) {
        double netTicketPrice = 100.0;
        double vat = computeVAT(netTicketPrice);
        double passengerFee = getPassengerFee();

        System.out.println("Pris: " + (netTicketPrice + vat + passengerFee));
        System.out.println("Moms: " + vat);
        System.out.println("Passasjeravgift: " + passengerFee);
    }
}
