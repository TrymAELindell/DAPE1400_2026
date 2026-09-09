import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 43.
//
// Fasit comment (the choice): this solution uses a switch. The months
// with the same number of days share one case, so the whole calendar
// fits in three lines, and februar gets one extra line. Another good
// solution is an if-else chain. The disadvantage: you must write long
// chains of || to group the months, and the shared cases exist exactly
// to remove that repetition.
public class DaysInMonth {
    public static void main(String[] args) {
        String month = showInputDialog("Skriv inn et månedsnavn:");

        int days = switch (month) {
            case "januar", "mars", "mai", "juli", "august", "oktober", "desember" -> 31;
            case "april", "juni", "september", "november" -> 30;
            case "februar" -> 28;
            default -> 0;
        };

        if (days == 0) {
            showMessageDialog(null, month + " er ikke et månedsnavn");
        } else {
            showMessageDialog(null, month + " har " + days + " dager");
        }
    }
}
