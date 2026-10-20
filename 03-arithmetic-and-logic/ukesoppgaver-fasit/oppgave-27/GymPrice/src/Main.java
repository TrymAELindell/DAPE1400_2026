import javax.swing.JOptionPane;

// Reference solution for exercise 27.
public class Main {
    public static void main(String[] args) {
        String memberInput = JOptionPane.showInputDialog("Er du medlem? (ja/nei)");
        boolean isMember = memberInput.equals("ja");

        double price = 200.0;

        // ! turns "is a member" into "is not a member".
        if (!isMember) {
            price = price + 50.0;
        }

        JOptionPane.showMessageDialog(null, "Du skal betale " + price + " kr.");
    }
}
