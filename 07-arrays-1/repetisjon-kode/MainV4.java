public class MainV4 {
    public static void main(String[] args) {
        PlaneV4 plane = new PlaneV4(7, 2);

        // The seats are now Seat objects with the passenger's name,
        // so setFreeSeatToTaken takes a passengerName parameter.
        plane.setFreeSeatToTaken("Arushan");
        plane.setFreeSeatToTaken("Jørgen");
        plane.setFreeSeatToTaken("Kristine");
        plane.setFreeSeatToTaken("Kine");
    }
}
