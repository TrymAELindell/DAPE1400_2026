// Reference solution for exercise 10: an electric bike is a bicycle with a range.
public class ElectricBike extends Bicycle {
    private int rangeKm;

    public ElectricBike(String brand, int basePrice, int rangeKm) {
        super(brand, basePrice);
        this.rangeKm = rangeKm;
    }

    public String toString() {
        return super.toString() + ", rekkevidde " + rangeKm + " km";
    }
}
