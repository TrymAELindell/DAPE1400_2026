public class MainV1 {
    public static void main(String[] args) {
        // With an array we can choose the number of seats when the plane is created,
        // which makes it practical to create planes of any size.
        PlaneV1 plane = new PlaneV1(15);
        // PlaneV1 creates a boolean array with nrOfSeats elements.

        // To mark a seat as taken we use the setFreeSeatToTaken method,
        // which takes a seat number (seat index) and tries to set that element to true.
        plane.setFreeSeatToTaken(3);
        plane.setFreeSeatToTaken(2);
        plane.setFreeSeatToTaken(3);
        // This is a bit impractical: as the plane fills up it gets hard to
        // find a free seat if we have to guess indexes manually.
        // PlaneV2 solves this with a loop.
    }
}
