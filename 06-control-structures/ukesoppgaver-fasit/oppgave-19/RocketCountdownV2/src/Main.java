import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 19.
//
// Dette er programmet fra forelesningen (repetisjon-kode/RocketCountdownV2).
public class Main {
    public static void main(String[] args) {
        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom;
        try {
            countFrom = Integer.parseInt(userInput);
        } catch (Exception e) {
            countFrom = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — nedtellingen starter fra 0");
        }

        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
