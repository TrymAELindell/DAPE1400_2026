// Reference solution for exercise 11: the Bicycle class, given in the handout.
public class Bicycle {
    private String brand;
    private int basePrice;

    public Bicycle(String brand, int basePrice) {
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public int computeDayPrice() {
        return basePrice;
    }

    public String toString() {
        return brand + ": " + computeDayPrice() + " kr per dag";
    }
}
