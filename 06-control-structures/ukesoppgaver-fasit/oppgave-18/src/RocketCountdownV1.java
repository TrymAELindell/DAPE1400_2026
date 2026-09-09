import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 18. This is the same program that was live-coded
// in the lecture (lecture-code/RocketCountdownV1.java): the while version
// of the countdown. Exercise 19 is the for version.
public class RocketCountdownV1 {
    public static void main(String[] args) {
        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom = Integer.parseInt(userInput);
        int currentCount = countFrom;

        while (currentCount > 0) {
            System.out.println(currentCount);
            currentCount--;
        }
        System.out.println("Launch!");
    }
}
