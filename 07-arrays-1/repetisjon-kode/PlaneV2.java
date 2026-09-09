public class PlaneV2 {
    private boolean[] seatsTaken;

    public PlaneV2(int nrOfSeats) {
        this.seatsTaken = new boolean[nrOfSeats];
    }

    public void setFreeSeatToTaken() {
        boolean seatFound = false;
        for (int seatIndex = 0; seatIndex < seatsTaken.length; seatIndex++) {
            if (!seatsTaken[seatIndex]) {
                seatsTaken[seatIndex] = true;
                seatFound = true;
                System.out.println("Ledig sete funnet, ditt sete nr er: " + seatIndex);
                break; // We do not want to check the remaining seats once we have found a free one.
            }
        }
        if (!seatFound) {
            System.out.println("Beklager, flyet er fullt. Ingen ledige seter funnet");
        }
    }
}
