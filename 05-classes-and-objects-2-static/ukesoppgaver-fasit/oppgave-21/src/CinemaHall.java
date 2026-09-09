// Reference solution for exercise 21: the class the exercise asks about. One shared price, one name per object:
// changing the price through any object - or through the class - changes
// it for all of them.
public class CinemaHall {
    private static double ticketPrice = 150.0;
    private String hallName;

    public CinemaHall(String hallName) {
        this.hallName = hallName;
    }

    public void printPrice() {
        System.out.println(this.hallName + ": " + ticketPrice + " kr");
    }

    public static void setTicketPrice(double newPrice) {
        ticketPrice = newPrice;
    }
}
