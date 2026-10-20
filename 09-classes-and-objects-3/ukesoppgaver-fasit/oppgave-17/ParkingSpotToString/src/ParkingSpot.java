// Reference solution for exercise 17: the parking spot from exercise 11, with toString.
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

    public String toString() {
        if (car == null) {
            return "Plass " + number + ": ledig";
        }
        return "Plass " + number + ": " + car;
    }
}
