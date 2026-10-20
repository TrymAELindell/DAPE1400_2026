public class SeatBooker {

    public static boolean bookSeatInPlane(Plane plane) {
        // Metoden bruker bare parameteren plane, så den kan være statisk. Da
        // trenger vi ikke lage et SeatBooker-objekt for å kalle den.
        for (int seatNr = 0; seatNr < plane.getNrOfSeats(); seatNr ++) {
            if (plane.setSeatToTaken(seatNr)){
                return true;
            }
        }
        return false;
    }
}
