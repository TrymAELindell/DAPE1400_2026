import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 18.
//
// Dette er programmet fra forelesningen (repetisjon-kode/RocketCountdownV1),
// while-versjonen av nedtellingen. Oppgave 19 er for-versjonen.
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
        int currentCount = countFrom;

        while (currentCount > 0) {
            System.out.println(currentCount);
            currentCount--;
        }
        System.out.println("Launch!");
    }
}
