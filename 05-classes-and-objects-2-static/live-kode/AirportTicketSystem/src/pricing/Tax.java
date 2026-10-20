package pricing;

public class Tax {
    private static double passengerFee = 60;

    public static double computeVAT(double netPrice) {
        return netPrice * 0.25;
    }

    public static double getPassengerFee() {
        return passengerFee;
    }

}
