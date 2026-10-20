public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(10);

        // bookSeatInPlane returnerer true så lenge den fikk tatt et ledig sete.
        // Derfor kan kallet stå rett i betingelsen, og loopen tar alle setene.
        while (SeatBooker.bookSeatInPlane(plane)) {}
    }
}
