import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 28. Dialog-based, so it is checked by hand.
// UserInput.readNumber asks again until the text parses.
public class Main {
    public static void main(String[] args) {
        int count = UserInput.readNumber("Hvor mange poengsummer skal registreres?");

        int[] scores = new int[count];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = UserInput.readNumber("Skriv inn poengsum nummer " + (i + 1) + ":");
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        showMessageDialog(null,
                "Gjennomsnittet av " + scores.length + " poengsummer er " + average);
    }
}
