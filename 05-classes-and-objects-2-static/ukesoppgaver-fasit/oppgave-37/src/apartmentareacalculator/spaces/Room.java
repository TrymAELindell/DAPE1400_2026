package apartmentareacalculator.spaces;

// Reference solution for exercise 37.
public class Room {
    private double width;
    private double length;

    public Room(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
