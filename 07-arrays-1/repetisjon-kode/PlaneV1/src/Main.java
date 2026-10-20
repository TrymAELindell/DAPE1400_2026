public class Main {
    public static void main(String[] args) {
        // Med en array velger vi antall seter når flyet opprettes. Konstruktøren
        // lager en boolsk array med 15 elementer.
        Plane plane = new Plane(15);

        // setFreeSeatToTaken tar et setenummer (en indeks) og prøver å sette
        // det elementet til true.
        plane.setFreeSeatToTaken(3);
        plane.setFreeSeatToTaken(2);
        plane.setFreeSeatToTaken(3);
        // Når flyet fylles opp, er det vanskelig å gjette et ledig setenummer.
        // Prosjektet PlaneV2 løser dette med en loop.
    }
}
