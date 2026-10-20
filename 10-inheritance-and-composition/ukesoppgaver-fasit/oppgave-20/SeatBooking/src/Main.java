import java.util.ArrayList;

// Reference solution for exercise 20: check two wanted seats against the sold ones.
public class Main {
    public static void main(String[] args) {
        ArrayList<Seat> sold = new ArrayList<>();
        sold.add(new Seat(5, 11));
        sold.add(new Seat(5, 12));
        sold.add(new Seat(6, 3));

        Seat[] wanted = { new Seat(5, 12), new Seat(5, 13) };
        for (Seat seat : wanted) {
            boolean isSold = false;
            for (Seat soldSeat : sold) {
                if (soldSeat.equals(seat)) {
                    isSold = true;
                }
            }
            if (isSold) {
                System.out.println(seat + " er allerede solgt");
            } else {
                System.out.println(seat + " er ledig");
            }
        }
    }
}
