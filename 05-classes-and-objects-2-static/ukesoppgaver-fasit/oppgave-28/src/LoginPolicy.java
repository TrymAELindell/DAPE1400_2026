// Reference solution for exercise 28: the class the exercise asks about. The three keywords on MAX_ATTEMPTS are
// what the task asks about: private keeps the rule inside the class,
// static gives the two static methods something they can reach, and
// final stops anyone raising the limit while the program runs.
public class LoginPolicy {
    private static final int MAX_ATTEMPTS = 3;

    public static boolean hasAttemptsLeft(int attemptsUsed) {
        return attemptsUsed < MAX_ATTEMPTS;
    }

    public static String getWarning(int attemptsUsed) {
        return "Du har brukt " + attemptsUsed + " av " + MAX_ATTEMPTS + " forsøk.";
    }
}
