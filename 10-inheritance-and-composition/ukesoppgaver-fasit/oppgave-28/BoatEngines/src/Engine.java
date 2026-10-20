// Reference solution for exercise 28 (Del 2): counts the hours an engine has run.
public class Engine {
    private int hours;

    public void run(int hours) {
        this.hours += hours;
    }

    public int getHours() {
        return hours;
    }
}
