import static javax.swing.JOptionPane.*;

// Reference solution for exercise 6.
//
// Det samme valget som i oppgave 5, nå med switch. Månedene som hører til
// samme årstid, deler én case, og gjentakelsen fra oppgave 5 forsvinner.
public class Main {
    public static void main(String[] args) {
        String month = showInputDialog("Skriv inn et månedsnavn:");
        month = month.toLowerCase();

        switch (month) {
            case "desember", "januar", "februar" -> {
                showMessageDialog(null, month + " er en vintermåned");
            }
            case "mars", "april", "mai" -> {
                showMessageDialog(null, month + " er en vårmåned");
            }
            case "juni", "juli", "august" -> {
                showMessageDialog(null, month + " er en sommermåned");
            }
            case "september", "oktober", "november" -> {
                showMessageDialog(null, month + " er en høstmåned");
            }
            default -> {
                showMessageDialog(null, month + " er ikke et månedsnavn");
            }
        }
    }
}
