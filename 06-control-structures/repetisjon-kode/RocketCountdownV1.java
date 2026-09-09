import static javax.swing.JOptionPane.showInputDialog;

public class RocketCountdownV1 {
    public static void main(String[] args) {
        // V1 of RocketCountdown uses a while loop, so we can count down
        // from an arbitrary number.

        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom = Integer.parseInt(userInput);
        int currentCount = countFrom;

        // A while loop runs until the condition inside the parentheses
        // becomes false. Here the condition is that currentCount is
        // greater than 0 (currentCount > 0).
        while (currentCount > 0) {
            System.out.println(currentCount); // currentCount is printed here
            currentCount--; // Since we count downwards, currentCount must decrease on every iteration.
            // If we never decrease currentCount, we are trapped in an
            // infinite loop, because the condition stays true forever.
        }
        System.out.println("Launch!");

        // This program works fine, but there is a tidier way to write
        // a loop like this: a for loop, which you will see in V2.
    }
}
