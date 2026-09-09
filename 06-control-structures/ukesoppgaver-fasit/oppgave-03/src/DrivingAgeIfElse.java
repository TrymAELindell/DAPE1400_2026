import static javax.swing.JOptionPane.*;

// Reference solution for exercise 3: the same choice expressed as one if-else.
public class DrivingAgeIfElse {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn alderen din:");
        int age = Integer.parseInt(input);

        if (age >= 18) {
            showMessageDialog(null, "Du kan ta førerkort for bil, da du er gammel nok");
        } else {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
    }
}
