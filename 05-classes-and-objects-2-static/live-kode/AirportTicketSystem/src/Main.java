import static pricing.Tax.*;

public class Main {
    public static void main(String[] args) {

        double netPrice = 3000;
        double VAT = computeVAT(netPrice);
        double passengerFee = getPassengerFee();

        System.out.println("Netto pris per billett: " + netPrice);
        System.out.println("Moms: "+ VAT);
        System.out.println("Passenger fee: " + passengerFee);
        System.out.println("Total pris: " + (netPrice + VAT + passengerFee));


        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        System.out.println("Vi har printed: " + Ticket.getNrOfTicketsPrinted() + " billetter");



    }
}
