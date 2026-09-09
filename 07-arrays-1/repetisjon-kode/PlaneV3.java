public class PlaneV3 {
    private boolean[][] seatsTaken;

    public PlaneV3(int nrOfRows, int nrOfSeatsPerRow) {
        this.seatsTaken = new boolean[nrOfRows][nrOfSeatsPerRow];
    }

    public void setFreeSeatToTaken() {
        boolean seatFound = false;

        rowLoop: // Loop label — lets the break below exit the OUTER loop.
        for (int rowIndex = 0; rowIndex < seatsTaken.length; rowIndex++) {
            for (int seatIndex = 0; seatIndex < seatsTaken[rowIndex].length; seatIndex++) {
                if (!seatsTaken[rowIndex][seatIndex]) {
                    seatsTaken[rowIndex][seatIndex] = true;
                    System.out.println("Ledig sete funnet!");
                    System.out.println("Rad: " + rowIndex + " sete: " + seatIndex + "\n");
                    seatFound = true;
                    break rowLoop; // Without the label, break would only exit the inner loop
                                   // and the outer loop would keep running.
                }
            }
        }
        if (!seatFound) {
            System.out.println("Beklager, flyet er fullt. Ingen ledige seter funnet");
        }
    }

    public String toString() {
        String out = "";

        for (int rowIndex = 0; rowIndex < this.seatsTaken.length; rowIndex++) {
            out = out + rowIndex + " |";

            for (int seatIndex = 0; seatIndex < this.seatsTaken[rowIndex].length; seatIndex++) {
                out = out + " " + this.seatsTaken[rowIndex][seatIndex];
            }

            out = out + " |\n";
        }
        return out;
    }
}
