// Reference solution for exercise 36 (Del 3): a cake with a fixed price.
public class Cake {
    private String name;
    private int basePrice;

    public Cake(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return basePrice;
    }

    public String toString() {
        return name + ": " + getPrice() + " kr";
    }
}
