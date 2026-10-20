package airportticketsystemV5.ticketing;

import static airportticketsystemV5.pricing.Tax.*;

// Reference solution for exercise 19.
public class Receipt {
    private int ticketNr;
    private String paymentAccountNr;
    private double netPrice;
    private double vat;
    private double passengerFee;
    private double totalPrice;

    public Receipt(String paymentAccountNr, double netPrice, int ticketNr) {
        this.paymentAccountNr = paymentAccountNr;
        this.netPrice = netPrice;
        this.vat = computeVAT(netPrice);
        this.passengerFee = getPassengerFee();
        this.totalPrice = this.netPrice + this.vat + this.passengerFee;
        this.ticketNr = ticketNr;
    }

    public void printReceipt() {
        System.out.println("\nKvittering for billett nummer: " + this.ticketNr);
        System.out.println("Betalingskonto: " + this.paymentAccountNr);
        System.out.println("Total pris: " + this.totalPrice);
        System.out.println("Herav");
        System.out.println("Billett: " + this.netPrice);
        System.out.println("Moms: " + this.vat);
        System.out.println("Passasjeravgift: " + this.passengerFee);
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
}
