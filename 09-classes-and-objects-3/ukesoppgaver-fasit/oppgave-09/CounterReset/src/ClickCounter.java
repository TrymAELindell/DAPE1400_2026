// Reference solution for exercise 9: the counter from exercise 7, with reset.
public class ClickCounter {
    private int clicks;

    public void click() {
        clicks += 1;
    }

    public void reset() {
        clicks = 0;
    }

    public int getClicks() {
        return clicks;
    }
}
