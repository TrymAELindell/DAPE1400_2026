import javax.swing.JOptionPane;

// Reference solution for exercise 50.
public class Login {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Brukernavn:");
        String password = JOptionPane.showInputDialog("Passord:");

        // Both have to match, and equals is what compares strings. Putting one
        // if inside the other would answer the same way, but the rejection
        // message would then have to be written in two places - and the day
        // one of them is edited, the program contradicts itself.
        boolean approved = username.equals("kari") && password.equals("sopp123");

        if (approved) {
            JOptionPane.showMessageDialog(null, "Innlogging godkjent.");
        } else {
            JOptionPane.showMessageDialog(null, "Feil brukernavn eller passord.");
        }
    }
}
