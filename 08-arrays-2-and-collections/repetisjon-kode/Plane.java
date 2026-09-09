public class Plane {
    // This variant of the Plane class has one role.
    // It keeps track of whether the seats in the plane are taken or not.
    // Unlike earlier implementations we do not have a method for finding free seats.
    // That responsibility has instead been placed in a separate class, SeatBooker.
    private boolean[] seatsTaken;

    public Plane(int nrOfSeats) {
        this.seatsTaken = new boolean[nrOfSeats];
    }

    public boolean setSeatToTaken(int seatIndex) {
        // Setter that returns a boolean so we know whether the attempt to take a free seat succeeded or not.
        // Control structure checking whether the seat is free or not
        if (this.seatsTaken[seatIndex] == false) {
            this.seatsTaken[seatIndex] = true;
            return true;
        } else {
            return false;
        }
    }

    public int getNrOfSeats() {
        // Getter returning the number of seats in the plane so that SeatBooker can loop through the seats
        return this.seatsTaken.length;
    }


}
