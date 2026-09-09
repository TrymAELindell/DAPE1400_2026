public class PlaneV4 {
    private Seat[][] seats;

    public PlaneV4(int nrOfRows, int nrOfSeatsPerRow) {
        this.seats = new Seat[nrOfRows][nrOfSeatsPerRow];
    }

    public void setFreeSeatToTaken(String name) {
        for (int rowIndex = 0; rowIndex < seats.length; rowIndex++) {
            for (int seatIndex = 0; seatIndex < seats[rowIndex].length; seatIndex++) {
                Seat seat = seats[rowIndex][seatIndex];
                if (seat == null) { // Object arrays start out filled with null,
                                    // so a null element means the seat is still free.
                    System.out.println("\nSete funnet til " + name);
                    System.out.println("Rad: " + rowIndex);
                    System.out.println("Sete: " + seatIndex);
                    seats[rowIndex][seatIndex] = new Seat(name);
                    return; // return exits the whole method, and thereby both loops.
                            // Note that no code after this point in the method runs.
                }
            }
        }
        System.out.println("Beklager, flyet er fullt");
    }
}
