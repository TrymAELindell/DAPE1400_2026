import static javax.swing.JOptionPane.*;

// Reference solution for exercise 3.
//
// Det samme valget som i oppgave 2, skrevet som én if-else-setning.
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
        } else {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
    }
}
