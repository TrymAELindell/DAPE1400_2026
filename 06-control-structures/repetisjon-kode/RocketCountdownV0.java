import static javax.swing.JOptionPane.*;

public class RocketCountdownV0 {
    public static void main(String[] args) {
        // This program takes user input and prints a countdown
        // from the user input down to 0.
        // V0 is a poor implementation because it does not scale.
        // Here we use if statements to print each number in the countdown.
        // That means we need one if statement per number, since we count
        // down from whatever number the user gives us.
        // A better solution is shown in V1.
        String userInput = showInputDialog("Start nedtelling fra:");
        int countdownFrom = Integer.parseInt(userInput);

        // This code only supports counting down from 3.
        if (countdownFrom >= 3) {
            System.out.println(3);
        }
        if (countdownFrom >= 2) {
            System.out.println(2);
        }
        if (countdownFrom >= 1) {
            System.out.println(1);
        }
        System.out.println("Launch!");
    }
}
