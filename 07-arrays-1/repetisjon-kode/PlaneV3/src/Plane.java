public class Plane {
    private boolean[][] seatsTaken;

    public Plane(int nrOfRows, int nrOfSeatsPerRow) {
        this.seatsTaken = new boolean[nrOfRows][nrOfSeatsPerRow];
    }

    public void setFreeSeatToTaken() {
        boolean seatFound = false;

        rowLoop: // en loop-label, som break rowLoop bruker nedenfor
        for (int rowIndex = 0; rowIndex < seatsTaken.length; rowIndex++) {
            for (int seatIndex = 0; seatIndex < seatsTaken[rowIndex].length; seatIndex++) {
                if (!seatsTaken[rowIndex][seatIndex]) {
                    seatsTaken[rowIndex][seatIndex] = true;
                    System.out.println("Ledig sete funnet!");
                    System.out.println("Rad: " + rowIndex + " sete: " + seatIndex + "\n");
                    seatFound = true;
                    break rowLoop; // bryter ut av den YTRE loopen
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
