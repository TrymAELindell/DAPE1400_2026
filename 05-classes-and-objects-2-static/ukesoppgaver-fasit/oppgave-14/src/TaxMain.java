// Reference solution for exercise 14. Both calls go straight to the class - no
// new Tax() anywhere, because there is no state to carry.
public class TaxMain {
    public static void main(String[] args) {
        double netTicketPrice = 100.0;
        double vat = Tax.computeVAT(netTicketPrice);
        double passengerFee = Tax.getPassengerFee();
        double totalPrice = netTicketPrice + vat + passengerFee;

        System.out.println("Pris: " + totalPrice);
        System.out.println("Billett: " + netTicketPrice);
        System.out.println("Moms: " + vat);
        System.out.println("Passasjeravgift: " + passengerFee);
    }
}
