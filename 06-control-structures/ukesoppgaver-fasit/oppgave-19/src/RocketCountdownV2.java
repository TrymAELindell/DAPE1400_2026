import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 19. This is the same program that was live-coded
// in the lecture (lecture-code/RocketCountdownV2.java).
public class RocketCountdownV2 {
    public static void main(String[] args) {
        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom = Integer.parseInt(userInput);

        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
