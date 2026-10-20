package pricing;

// Reference solution for exercise 18: the class itself is public, but the method has
// no access keyword at all: package-private. Every class inside pricing
// can call it; nothing outside the package can even see it.
public class FeeTable {

    static double getHandlingFee() {
        return 15.0;
    }
}
