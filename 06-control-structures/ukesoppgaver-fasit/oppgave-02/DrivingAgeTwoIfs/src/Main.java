import static javax.swing.JOptionPane.*;

// Reference solution for exercise 2: two free-standing if statements, no else.
//
// Legg merke til at begge betingelsene blir testet hver gang, selv om høyst
// én av dem kan være sann. Oppgave 3 viser den ryddigere if-else-versjonen.
public class Main {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn alderen din:");
        int age;
        try {
            age = Integer.parseInt(input);
        } catch (Exception e) {
            age = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — alderen er satt til 0");
        }

        if (age >= 18) {
            showMessageDialog(null, "Du kan ta førerkort for bil, da du er gammel nok");
        }
        if (age < 18) {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
    }
}
