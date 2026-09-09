// Reference solution for exercise 25: the corrected class. The handout's version has a static
// method reading the ordinary field weightInGrams, which does not compile:
// the method belongs to the class and runs without any object, so there is
// no weight for it to read.
//
// The fix taken here is to pass the weight in as a parameter, which leaves
// the method static and usable without an object. Making the method
// ordinary instead would compile just as well - and would tie every price
// lookup to an object that exists only to carry one number.
public class ShippingFixed {
    private static final double PRICE_PER_KILO = 45.0;

    public static double getShippingPrice(int weightInGrams) {
        return weightInGrams / 1000.0 * PRICE_PER_KILO;
    }
}
