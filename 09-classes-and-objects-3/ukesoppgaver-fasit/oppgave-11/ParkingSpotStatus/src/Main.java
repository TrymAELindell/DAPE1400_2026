// Reference solution for exercise 11: park a car and let it leave again.
public class Main {
    public static void main(String[] args) {
        ParkingSpot spot = new ParkingSpot(3);
        System.out.println(spot.getStatus());

        spot.park(new Car("EL12345"));
        System.out.println(spot.getStatus());

        spot.leave();
        System.out.println(spot.getStatus());
    }
}
