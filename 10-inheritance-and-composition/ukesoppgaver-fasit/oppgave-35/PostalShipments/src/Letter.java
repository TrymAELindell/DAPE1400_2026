// Reference solution for exercise 35 (Del 3): a letter has a fixed price.
public class Letter extends Shipment {
    public Letter() {
        super("Brev");
    }

    public int computePrice() {
        return 25;
    }
}
