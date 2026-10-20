// Reference solution for exercise 3.
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(14, 32, 5);
        clock.showTime();

        // Valid change
        clock.setHours(15);
        clock.showTime();

        // Invalid changes: the fields keep their old values
        clock.setHours(25);
        clock.setMinutes(-1);
        clock.setSeconds(60);
        clock.showTime();
    }
}
