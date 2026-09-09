package pricing;

public class Tax {
    private static final double PASSENGER_FEE = 60;

    public static double computeVAT(double price) {
        return price * 0.25;
    }

    public static double getPassengerFee() {
        return PASSENGER_FEE;
    }

    public static double computeFullTicketPrice(double price) {
        double vat = computeVAT(price);
        return price + vat + PASSENGER_FEE;
    }
}
