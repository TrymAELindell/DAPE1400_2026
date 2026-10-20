import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        // RocketCountdownV1 bruker en while-loop, så vi kan telle ned fra et
        // hvilket som helst tall.

        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom;
        try {
            countFrom = Integer.parseInt(userInput);
        } catch (Exception e) {
            countFrom = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — nedtellingen starter fra 0");
        }
        int currentCount = countFrom;

        // En while-loop kjører så lenge betingelsen i parentesen er sann.
        // Her er betingelsen currentCount > 0.
        while (currentCount > 0) {
            System.out.println(currentCount);
            // Vi teller nedover, så currentCount må bli mindre for hver runde.
            // Uten denne linja blir betingelsen aldri usann, og vi får en evig loop.
            currentCount--;
        }
        System.out.println("Launch!");

        // Programmet virker, men en for-loop er en ryddigere måte å skrive
        // denne loopen på. Den ser du i RocketCountdownV2.
    }
}
