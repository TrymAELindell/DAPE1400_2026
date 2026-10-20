import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 43.
//
// Denne løsningen bruker en switch. Månedene med like mange dager deler én
// case. Hele kalenderen får da plass på tre linjer, og februar får én linje
// ekstra. En annen god løsning er en else if-kjede. Ulempen er at du må
// skrive lange kjeder med || for å samle månedene. De delte casene finnes
// nettopp for å fjerne den gjentakelsen.
public class Main {
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
