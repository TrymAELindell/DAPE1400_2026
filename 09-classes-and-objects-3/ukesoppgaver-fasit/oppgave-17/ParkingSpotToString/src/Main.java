// Reference solution for exercise 17: print the parking spot object directly.
public class Main {
    public static void main(String[] args) {
        ParkingSpot spot = new ParkingSpot(3);
        System.out.println(spot);

        spot.park(new Car("EL12345"));
        System.out.println(spot);

        spot.leave();
        System.out.println(spot);
    }
}
