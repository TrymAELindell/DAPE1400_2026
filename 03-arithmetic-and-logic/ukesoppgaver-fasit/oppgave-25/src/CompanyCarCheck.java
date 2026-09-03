import javax.swing.JOptionPane;

// Reference solution for exercise 25.
public class CompanyCarCheck {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        String licenseInput = JOptionPane.showInputDialog("Har du førerkort? (ja/nei)");

        int age = Integer.parseInt(ageInput);

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
