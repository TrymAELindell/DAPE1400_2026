// Reference solution for exercise 12: the Bicycle class with a getter for the base price.
public class Bicycle {
    private String brand;
    private int basePrice;

    public Bicycle(String brand, int basePrice) {
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int computeDayPrice() {
        return basePrice;
    }

    public String toString() {
        return brand + ": " + computeDayPrice() + " kr per dag";
    }
}
