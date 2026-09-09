import static javax.swing.JOptionPane.*;

// Reference solution for exercise 5: season from month name with if / else if.
// toLowerCase makes the comparison tolerant of capitalisation.
public class SeasonFromMonthIfElse {
    public static void main(String[] args) {
        String month = showInputDialog("Skriv inn et månedsnavn:");
        month = month.toLowerCase();

        if (month.equals("desember") || month.equals("januar") || month.equals("februar")) {
            showMessageDialog(null, month + " er en vintermåned");
        } else if (month.equals("mars") || month.equals("april") || month.equals("mai")) {
            showMessageDialog(null, month + " er en vårmåned");
        } else if (month.equals("juni") || month.equals("juli") || month.equals("august")) {
            showMessageDialog(null, month + " er en sommermåned");
        } else if (month.equals("september") || month.equals("oktober") || month.equals("november")) {
            showMessageDialog(null, month + " er en høstmåned");
        } else {
            showMessageDialog(null, month + " er ikke et månedsnavn");
        }
    }
}
