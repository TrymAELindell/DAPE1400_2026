// Reference solution for exercise 11: a cargo bike is an electric bike with a load limit.
public class CargoBike extends ElectricBike {
    private int maxLoadKg;

    public CargoBike(String brand, int basePrice, int rangeKm, int maxLoadKg) {
        super(brand, basePrice, rangeKm);
        this.maxLoadKg = maxLoadKg;
    }

    public String toString() {
        return super.toString() + ", last opptil " + maxLoadKg + " kg";
    }
}
