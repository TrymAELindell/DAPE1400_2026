// Keeps track of which seats in the plane are taken.
// Finding a free seat is the job of SeatBooker.
public class Plane {
    private boolean[] seatsTaken;

    public Plane(int nrOfSeats) {
        this.seatsTaken = new boolean[nrOfSeats];
    }

    // Returns true if the seat was free and is now taken,
    // false if it was already taken.
    public boolean setSeatToTaken(int seatIndex) {
        if (this.seatsTaken[seatIndex] == false) {
            this.seatsTaken[seatIndex] = true;
            return true;
        } else {
            return false;
        }
    }

    public int getNrOfSeats() {
        return this.seatsTaken.length;
    }
}
