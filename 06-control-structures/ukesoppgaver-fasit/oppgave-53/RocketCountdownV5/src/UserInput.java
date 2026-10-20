import static javax.swing.JOptionPane.*;

// Reference solution for exercise 53. All user-input handling in one class, as
// static methods — no object state is needed here either.
public class UserInput {

    // Asks until the user supplies a valid integer, then returns it.
    public static int requestInt(String request) {
        int userInputAsInt = 0;
        boolean inputIsInt = false;

        do {
            String userInput = showInputDialog(request);
            try {
                userInputAsInt = Integer.parseInt(userInput);
                inputIsInt = true;
            } catch (Exception e) {
                showMessageDialog(null, "Input må være et heltall");
            }
        } while (!inputIsInt);

        return userInputAsInt;
    }

    // Asks once and reports whether the answer equals the target string.
    public static boolean requestAndVerifyTargetString(String request, String targetString) {
        String userInput = showInputDialog(request);
        return userInput.equals(targetString);
    }
}
