import javax.swing.JOptionPane;

// Reference solution for exercise 35.
public class DaysLived {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du (i år)?");

        // int is the right type for both the age and the day count: an age in
        // whole years gives a whole number of days, and even 120 years is only
        // 43 800 days - far below int's limit. double would run just as well,
        // but it would print "omtrent 7665.0 dager", claiming a precision the
        // input never had.

        // Declared before the try so it is still in scope after it; a
        // variable declared inside the try block would only exist there.
        int ageYears = 0;
        try {
            ageYears = Integer.parseInt(ageInput);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input var ikke gyldig. Må være et positivt heltall. Alder er satt til 0 år");
        }
        int days = ageYears * 365;

        JOptionPane.showMessageDialog(null, "Du har levd i omtrent " + days + " dager!");
    }
}
