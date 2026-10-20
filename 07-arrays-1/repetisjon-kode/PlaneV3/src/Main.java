public class Main {
    public static void main(String[] args) {
        // Plane lagrer setene i en todimensjonal array, så et sete har en rad
        // og et setenummer. Derfor tar konstruktøren to parametre: antall
        // rader og antall seter per rad.
        Plane plane = new Plane(5, 4);

        // Å finne et ledig sete krever nå nested looper. Det skjer i
        // setFreeSeatToTaken.
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();

        // Vil vi også lagre navnet på passasjeren, holder ikke en boolsk array.
        // Prosjektet PlaneV4 bruker derfor en array av en egen klasse, Seat.
    }
}
