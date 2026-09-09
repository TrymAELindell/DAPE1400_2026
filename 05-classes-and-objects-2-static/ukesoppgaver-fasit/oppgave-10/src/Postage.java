// Reference solution for exercise 10. Every rate and limit is a named constant:
// static because the values belong to the price list, not to a single
// letter, and final because a postage rate must not change while the
// program runs.
public class Postage {
    private static final double SMALL_LETTER_PRICE = 24.0;
    private static final double LARGE_LETTER_PRICE = 39.0;
    private static final double PARCEL_PRICE = 89.0;

    private static final int SMALL_LETTER_LIMIT = 20;
    private static final int LARGE_LETTER_LIMIT = 350;

    private int weightInGrams;

    public Postage(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getPrice() {
        if (this.weightInGrams <= SMALL_LETTER_LIMIT) {
            return SMALL_LETTER_PRICE;
        } else if (this.weightInGrams <= LARGE_LETTER_LIMIT) {
            return LARGE_LETTER_PRICE;
        } else {
            return PARCEL_PRICE;
        }
    }

    // Double.MAX_VALUE stands in for "no upper limit at all" - a built-in
    // constant used the same way as the ones declared above.
    public static double getHeaviestAllowedWeight() {
        return Double.MAX_VALUE;
    }
}
