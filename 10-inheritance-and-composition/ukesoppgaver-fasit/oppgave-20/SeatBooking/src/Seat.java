// Reference solution for exercise 20: a seat in the concert hall, equal by row and number.
public class Seat {
    private int row;
    private int number;

    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
    }

    public boolean equals(Object other) {
        if (other instanceof Seat) {
            Seat seat = (Seat) other;
            return row == seat.row && number == seat.number;
        }
        return false;
    }

    public String toString() {
        return "Rad " + row + ", sete " + number;
    }
}
