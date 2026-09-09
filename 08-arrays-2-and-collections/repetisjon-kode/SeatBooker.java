public class SeatBooker {

    public static boolean bookSeatInPlane(Plane plane) {
        // Since the bookSeatInPlane method only performs operations and logic on its
        // input parameter (plane), it can be static, so that we do not need to create
        // objects of the class to get access to the method.
        for (int seatNr = 0; seatNr < plane.getNrOfSeats(); seatNr ++) {
            if (plane.setSeatToTaken(seatNr)){
                return true;
            }
        }
        return false;
    }
}
