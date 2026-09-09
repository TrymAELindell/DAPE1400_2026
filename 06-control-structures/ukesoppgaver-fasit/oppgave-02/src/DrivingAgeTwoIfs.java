import static javax.swing.JOptionPane.*;

// Reference solution for exercise 2: two free-standing if statements, no else.
// Note that both conditions are evaluated every time, even though at most
// one of them can be true — exercise 3 shows the tidier if-else version.
public class DrivingAgeTwoIfs {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn alderen din:");
        int age = Integer.parseInt(input);

        if (age >= 18) {
            showMessageDialog(null, "Du kan ta førerkort for bil, da du er gammel nok");
        }
        if (age < 18) {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
    }
}
