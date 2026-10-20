public class Plane {
    private boolean[] seatsTaken;

    public Plane(int nrOfSeats) {
        this.seatsTaken = new boolean[nrOfSeats];
    }

    public void setFreeSeatToTaken() {
        boolean seatFound = false;
        for (int seatIndex = 0; seatIndex < seatsTaken.length; seatIndex++) {
            if (!seatsTaken[seatIndex]) {
                seatsTaken[seatIndex] = true;
                seatFound = true;
                System.out.println("Ledig sete funnet, ditt sete nr er: " + seatIndex);
                break; // vi har funnet et ledig sete, så resten trenger vi ikke sjekke
            }
        }
        if (!seatFound) {
            System.out.println("Beklager, flyet er fullt. Ingen ledige seter funnet");
        }
    }
}
