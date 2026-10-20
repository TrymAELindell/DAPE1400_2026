// Reference solution for exercise 11: a parking spot that is free when car is null.
public class ParkingSpot {
    private int number;
    private Car car;

    public ParkingSpot(int number) {
        this.number = number;
    }

    public void park(Car car) {
        this.car = car;
    }

    public void leave() {
        car = null;
    }

    public String getStatus() {
        if (car == null) {
            return "Plass " + number + ": ledig";
        }
        return "Plass " + number + ": " + car.getRegistrationNumber();
    }
}
