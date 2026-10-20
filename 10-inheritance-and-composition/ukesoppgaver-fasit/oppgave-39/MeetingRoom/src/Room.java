// Reference solution for exercise 39 (Del 3): a meeting room that can be booked.
public class Room {
    private String name;
    private boolean isBooked;

    public Room(String name) {
        this.name = name;
        this.isBooked = false;
    }

    public boolean book() {
        if (isBooked) {
            return false;
        }
        isBooked = true;
        return true;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if (isBooked) {
            return name + " (opptatt)";
        }
        return name + " (ledig)";
    }
}
