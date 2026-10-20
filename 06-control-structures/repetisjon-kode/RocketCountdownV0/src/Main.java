import static javax.swing.JOptionPane.*;

// Counts down from the number the user types in, then prints "Launch!".
public class Main {
    public static void main(String[] args) {
        // Denne versjonen trenger én if-setning per tall, så den virker ikke
        // for store tall. RocketCountdownV1 løser det samme problemet med en loop.
        String userInput = showInputDialog("Start nedtelling fra:");
        int countdownFrom;
        try {
            countdownFrom = Integer.parseInt(userInput);
        } catch (Exception e) {
            countdownFrom = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — nedtellingen starter fra 0");
        }

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
