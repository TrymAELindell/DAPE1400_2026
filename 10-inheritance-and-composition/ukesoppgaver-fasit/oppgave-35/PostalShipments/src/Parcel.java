// Reference solution for exercise 35 (Del 3): a parcel is priced by its weight.
public class Parcel extends Shipment {
    private int weightKg;

    public Parcel(int weightKg) {
        super("Pakke (" + weightKg + " kg)");
        this.weightKg = weightKg;
    }

    public int computePrice() {
        return 60 + 10 * weightKg;
    }
}
