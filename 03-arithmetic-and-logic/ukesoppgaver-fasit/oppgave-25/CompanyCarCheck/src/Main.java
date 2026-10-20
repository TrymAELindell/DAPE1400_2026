import javax.swing.JOptionPane;

// Reference solution for exercise 25.
public class Main {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        String licenseInput = JOptionPane.showInputDialog("Har du førerkort? (ja/nei)");

        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — alderen er satt til 0");
        }

        boolean oldEnough = age > 25;
        boolean hasLicense = licenseInput.equals("ja");

        // Both conditions have to hold, so the two boolean values are joined
        // with &&.
        boolean mayBorrowCar = oldEnough && hasLicense;

        if (mayBorrowCar) {
            JOptionPane.showMessageDialog(null, "Du får låne firmabilen.");
        } else {
            JOptionPane.showMessageDialog(null, "Du får ikke låne firmabilen.");
        }
    }
}
