import javax.swing.JOptionPane;

// Reference solution for exercise 43.
public class DriversLicenseAgeCheck {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        int age = Integer.parseInt(ageInput);

        int licenseAge = 18;

        // if/else is the right shape here: the two messages are exact
        // opposites, so one condition decides both outcomes and exactly one
        // of them can ever run. Two separate if statements with opposite
        // conditions would print the same thing, but the reader has to check
        // both conditions to be sure they never overlap - and the day someone
        // edits one of them, the program can print both messages or neither.
        if (age >= licenseAge) {
            JOptionPane.showMessageDialog(null,
                    "Du er gammel nok til å ta førerkort for bil");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Du er for ung til å ta førerkort for bil");
        }
    }
}
