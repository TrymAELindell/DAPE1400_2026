public class MainV3 {
    public static void main(String[] args) {
        // PlaneV3 stores whether seats are taken in a 2D array,
        // so a seat is identified by a row and a seat number within the row.
        // The constructor therefore takes two parameters:
        // the number of rows and the number of seats per row.
        PlaneV3 plane = new PlaneV3(5, 4);

        // Since the seats are now in a 2D array, finding a free seat
        // requires a nested loop. This is implemented in setFreeSeatToTaken.
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();

        // A boolean array works for tracking whether seats are taken,
        // but we might want to store more information — for example the
        // name of the passenger in the seat. Since arrays can hold objects
        // of our own classes, we can make a Seat class and use an array of
        // Seat instead of a boolean array. PlaneV4 implements this.
    }
}
