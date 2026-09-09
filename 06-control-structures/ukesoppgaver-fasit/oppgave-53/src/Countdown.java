// Reference solution for exercise 53. The countdown itself, separated out.
// The method is static (module 05): it needs no object state — everything
// it uses arrives as a parameter.
public class Countdown {
    public static void startCountdown(int countFrom) {
        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
