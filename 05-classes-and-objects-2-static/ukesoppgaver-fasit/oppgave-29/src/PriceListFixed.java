// Reference solution for exercise 29: the corrected class. In the handout's version the VAT
// rate is written as the literal 0.25 in one method and 0.20 in another -
// the same rule, spelled two ways, and nothing in the code says they were
// meant to agree. One named constant makes the disagreement impossible.
public class PriceListFixed {
    private static final double VAT_RATE = 0.25;

    public static double getPriceWithVAT(double netPrice) {
        return netPrice + netPrice * VAT_RATE;
    }

    public static double getVAT(double netPrice) {
        return netPrice * VAT_RATE;
    }
}
