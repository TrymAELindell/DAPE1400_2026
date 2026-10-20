package pricing;

// Reference solution for exercise 18: the same class as the
// default-package Tax from exercise 14, now living in the pricing package.
// The file sits in a folder called pricing, matching the package name.
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
