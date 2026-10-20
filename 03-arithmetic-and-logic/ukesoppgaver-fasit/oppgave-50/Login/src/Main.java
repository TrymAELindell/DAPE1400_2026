import javax.swing.JOptionPane;

// Reference solution for exercise 50.
public class Main {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Brukernavn:");
        String password = JOptionPane.showInputDialog("Passord:");

        // Both username and password have to match, so && joins the two
        // tests. The method equals is what compares strings. Putting one if
        // inside the other would answer the same way. But you would then
        // have to write the rejection message in two places. And if someone
        // later edits one of them, the program contradicts itself.
        boolean approved = username.equals("kari") && password.equals("sopp123");

        if (approved) {
            JOptionPane.showMessageDialog(null, "Innlogging godkjent.");
        } else {
            JOptionPane.showMessageDialog(null, "Feil brukernavn eller passord.");
        }
    }
}
