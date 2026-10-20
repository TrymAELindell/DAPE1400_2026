import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

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

        // En for-loop samler start, betingelse og oppdatering av
        // tellevariabelen på én linje. Når vi vet hvor mange runder loopen
        // skal gå, som her, er for-loopen som regel det beste valget.
        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
