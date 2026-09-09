package airportticketsystemV5.pricing;

// Reference solution for exercise 19.
public class Tax {
    private static final double VAT_RATE = 0.25;
    private static final double PASSENGER_FEE = 60;

    // A private constructor: nobody should instantiate Tax objects,
    // the class only carries static methods and constants
    private Tax() {}

    public static double computeVAT(double preVATPrice) {
        return preVATPrice * VAT_RATE;
    }

    public static double getPassengerFee() {
        return PASSENGER_FEE;
    }
}
