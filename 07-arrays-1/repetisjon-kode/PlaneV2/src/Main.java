public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(15);

        // Nå finner setFreeSeatToTaken et ledig sete selv. Metoden looper
        // gjennom setearrayen til den finner et ledig sete.
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        // Et ekte sete har en rad og et setenummer på raden, altså to indekser.
        // Prosjektet PlaneV3 bruker en todimensjonal array til dette.
    }
}
