import javax.swing.JOptionPane;

// Reference solution for exercise 35.
public class Main {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du (i år)?");

        // int is the right type for both ageYears and days. An age in whole
        // years gives a whole number of days. Even 120 years is only 43 800
        // days, far below the limit of int. double would run just as well.
        // But it would print "omtrent 7665.0 dager". The .0 looks exact,
        // but the input was only whole years.

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
