public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(7, 2);

        // Setene er nå Seat-objekter med navnet på passasjeren. Derfor tar
        // setFreeSeatToTaken navnet som parameter.
        plane.setFreeSeatToTaken("Arushan");
        plane.setFreeSeatToTaken("Jørgen");
        plane.setFreeSeatToTaken("Kristine");
        plane.setFreeSeatToTaken("Kine");
    }
}
