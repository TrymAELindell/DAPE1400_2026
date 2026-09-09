import pricing.Tax;

// Reference solution for exercise 16. The class now lives in another package, so it
// has to be imported before the class name can be written here.
public class PricingMain {
    public static void main(String[] args) {
        double netTicketPrice = 100.0;
        double vat = Tax.computeVAT(netTicketPrice);
        double passengerFee = Tax.getPassengerFee();

        System.out.println("Pris: " + (netTicketPrice + vat + passengerFee));
        System.out.println("Moms: " + vat);
        System.out.println("Passasjeravgift: " + passengerFee);
    }
}
