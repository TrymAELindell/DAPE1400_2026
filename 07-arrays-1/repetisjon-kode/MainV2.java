public class MainV2 {
    public static void main(String[] args) {
        PlaneV2 plane = new PlaneV2(15);

        // setFreeSeatToTaken now finds a free seat automatically:
        // the method loops through the seat array until it finds a free seat.
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        // One problem with PlaneV2 is that we only get a single seat number.
        // A real plane ticket gives us a row and a seat number within that row,
        // so seats really have two indexes.
        // To represent that we can use a 2D array, which we do in PlaneV3.
    }
}
