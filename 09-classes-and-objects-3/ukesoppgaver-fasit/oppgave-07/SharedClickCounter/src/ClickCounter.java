// Reference solution for exercise 7: a counter without a constructor.
public class ClickCounter {
    private int clicks;

    public void click() {
        clicks += 1;
    }

    public int getClicks() {
        return clicks;
    }
}
