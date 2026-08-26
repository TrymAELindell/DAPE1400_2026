import javax.swing.JOptionPane;

// Reference solution for extra exercise 3.
public class DaysLived {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du (i år)?");
        int ageYears = Integer.parseInt(ageInput);

        // int is the sensible data type here: an age is a whole number of
        // years, and the result stays far below int's max value (even 120
        // years is only 43 800 days). double would suggest a precision the
        // input does not have — we do not know anyone's age to the day.
        int days = ageYears * 365;

        JOptionPane.showMessageDialog(null, "Du har levd i omtrent " + days + " dager!");
    }
}
