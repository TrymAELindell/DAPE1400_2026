// Reference solution for exercise 21: the run the exercise asks about.
public class CinemaHallMain {
    public static void main(String[] args) {
        CinemaHall bigHall = new CinemaHall("Sal 1");
        CinemaHall smallHall = new CinemaHall("Sal 2");

        bigHall.printPrice();
        smallHall.printPrice();

        CinemaHall.setTicketPrice(120.0);

        bigHall.printPrice();
        smallHall.printPrice();
    }
}
