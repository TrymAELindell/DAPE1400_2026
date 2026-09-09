// Reference solution for exercise 2.
public class FuelPurchase {
    private String stationLocation;
    private String fuelType;
    private double liters;
    private double pricePerLiter;
    private String timeOfPurchase;

    public FuelPurchase(String stationLocation, String fuelType, double liters,
                        double pricePerLiter, String timeOfPurchase) {
        this.stationLocation = stationLocation;
        this.fuelType = fuelType;
        this.liters = liters;
        this.pricePerLiter = pricePerLiter;
        this.timeOfPurchase = timeOfPurchase;
    }

    public String getStationLocation() {
        return this.stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getLiters() {
        return this.liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public double getPricePerLiter() {
        return this.pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public String getTimeOfPurchase() {
        return this.timeOfPurchase;
    }

    public void setTimeOfPurchase(String timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public double calculateTotalPrice() {
        return this.liters * this.pricePerLiter;
    }
}
