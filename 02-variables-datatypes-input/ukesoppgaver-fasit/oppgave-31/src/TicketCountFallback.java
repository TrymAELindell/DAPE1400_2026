import javax.swing.JOptionPane;

// Reference solution for exercise 31 - the program the exercise asks about.
// Pressing OK without typing anything gives an empty string, which
// Integer.parseInt cannot turn into a number, so the catch block runs.
//
// Whether 1 is the right fallback has no single answer. 1 assumes the user
// wants at least one ticket, but orders something they never asked for; 0
// orders nothing, but leaves the whole order worthless unless the message
// says so plainly. Either is defensible as long as the choice is deliberate
// and the user is told what the program did.
//
// Both are stopgaps. The real fix is to keep asking until the input is
// valid, which needs a loop - module 06.
public class TicketCountFallback {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Hvor mange billetter vil du ha?");

        int tickets;
        try {
            tickets = Integer.parseInt(input);
        } catch (Exception e) {
            tickets = 1;
            JOptionPane.showMessageDialog(null, "Vi tolker det som én billett.");
        }

        JOptionPane.showMessageDialog(null, "Du har bestilt " + tickets + " billett(er).");
    }
}
