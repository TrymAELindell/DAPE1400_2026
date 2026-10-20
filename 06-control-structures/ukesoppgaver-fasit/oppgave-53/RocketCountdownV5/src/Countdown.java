// Reference solution for exercise 53. The countdown itself, separated out.
//
// Metoden er statisk (modul 05). Den trenger ingen fields, fordi alt den
// bruker, kommer inn som parameter.
public class Countdown {
    public static void startCountdown(int countFrom) {
        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
