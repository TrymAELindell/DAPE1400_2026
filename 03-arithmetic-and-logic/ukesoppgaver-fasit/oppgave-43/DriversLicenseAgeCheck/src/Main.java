import javax.swing.JOptionPane;

// Reference solution for exercise 43.
public class Main {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — alderen er satt til 0");
        }

        int licenseAge = 18;

        // if/else is the right shape here. The two messages are exact
        // opposites, so one condition decides both outcomes. Exactly one of
        // them can ever run. Two separate if statements with opposite
        // conditions would print the same thing. But the reader has to
        // check both conditions to be sure they never overlap. And if
        // someone later edits one of them, the program can print both
        // messages or neither.
        if (age >= licenseAge) {
            JOptionPane.showMessageDialog(null,
                    "Du er gammel nok til å ta førerkort for bil");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Du er for ung til å ta førerkort for bil");
        }
    }
}
