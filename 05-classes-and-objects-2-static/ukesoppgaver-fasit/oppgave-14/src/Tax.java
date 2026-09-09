// Reference solution for exercise 14: the price calculation from the lecture, built
// from constants and static methods. computeVAT uses only its parameter;
// getPassengerFee uses only a static field. Neither needs an object, so
// neither is an ordinary method.
public class Tax {
    private static final double VAT_RATE = 0.25;
    private static final double PASSENGER_FEE = 60.0;

    public static double computeVAT(double netPrice) {
        return netPrice * VAT_RATE;
    }

    public static double getPassengerFee() {
        return PASSENGER_FEE;
    }
}
