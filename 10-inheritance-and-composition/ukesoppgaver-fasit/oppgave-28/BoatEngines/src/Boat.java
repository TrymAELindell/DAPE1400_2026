// Reference solution for exercise 28 (Del 2): each boat creates its own engine.
public class Boat {
    private String name;
    private Engine engine;

    public Boat(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    public void takeTrip(int hours) {
        engine.run(hours);
    }

    public String toString() {
        return name + ": motoren har gått " + engine.getHours() + " timer";
    }
}
