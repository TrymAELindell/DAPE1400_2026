import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 8: the days that belong together share a case,
// and the switch returns the text the printout needs.
public class WeekdayOrWeekend {
    public static void main(String[] args) {
        String day = showInputDialog("Skriv inn navnet på en ukedag:");

        String dayType = switch (day) {
            case "lørdag", "søndag" -> "helgedag";
            case "mandag", "tirsdag", "onsdag", "torsdag", "fredag" -> "hverdag";
            default -> "ukjent";
        };

        if (dayType.equals("ukjent")) {
            System.out.println(day + " er ikke en ukedag");
        } else {
            System.out.println(day + " er en " + dayType);
        }
    }
}
