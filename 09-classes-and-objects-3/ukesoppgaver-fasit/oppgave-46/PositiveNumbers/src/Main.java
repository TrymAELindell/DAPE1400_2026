import javax.swing.JOptionPane;

// Reference solution for exercise 46 (Del 3).
public class Main {
    public static void main(String[] args) {
        // To lokale variabler, deklarert i main rett før loopen, passer her. De
        // må overleve fra iterasjon til iterasjon, men ingen andre deler av
        // programmet trenger dem.
        // Fields i klassen ville også virket. Men da kan hele klassen endre dem,
        // og det blir vanskeligere å se hvor verdiene kommer fra.
        // En ArrayList med alle tallene ville også virket, men den tar vare på
        // hvert tall selv om programmet bare trenger antallet og summen.
        int positiveCount = 0;
        int positiveSum = 0;

        boolean done = false;
        while (!done) {
            String input = JOptionPane.showInputDialog("Skriv inn et heltall (0 for å avslutte):");
            try {
                int number = Integer.parseInt(input);
                if (number == 0) {
                    done = true;
                } else if (number > 0) {
                    positiveCount++;
                    positiveSum += number;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Du må skrive inn et heltall");
            }
        }

        System.out.println("Positive tall: " + positiveCount);
        System.out.println("Summen av dem: " + positiveSum);
    }
}
