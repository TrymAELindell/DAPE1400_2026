public class Plane {
    private Seat[][] seats;

    public Plane(int nrOfRows, int nrOfSeatsPerRow) {
        this.seats = new Seat[nrOfRows][nrOfSeatsPerRow];
    }

    public void setFreeSeatToTaken(String name) {
        for (int rowIndex = 0; rowIndex < seats.length; rowIndex++) {
            for (int seatIndex = 0; seatIndex < seats[rowIndex].length; seatIndex++) {
                Seat seat = seats[rowIndex][seatIndex];
                if (seat == null) { // a null element is a free seat
                    System.out.println("\nSete funnet til " + name);
                    System.out.println("Rad: " + rowIndex);
                    System.out.println("Sete: " + seatIndex);
                    seats[rowIndex][seatIndex] = new Seat(name);
                    return; // return avslutter hele metoden, og dermed begge loopene
                }
            }
        }
        System.out.println("Beklager, flyet er fullt");
    }
}
