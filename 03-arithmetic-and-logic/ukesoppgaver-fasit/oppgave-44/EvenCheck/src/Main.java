import javax.swing.JOptionPane;

// Reference solution for exercise 44.
public class Main {
    public static void main(String[] args) {
        String numberInput = JOptionPane.showInputDialog("Skriv inn et heltall");
        int number;
        try {
            number = Integer.parseInt(numberInput);
        } catch (Exception e) {
            number = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — tallet er satt til 0");
        }

        // The expected output is exactly the value of the logical
        // expression. So the program prints the expression directly, and no
        // control structure is needed. An if/else with one message per
        // branch gives the same output. But it writes the same sentence
        // twice, and only "true" and "false" differ. That gives two places
        // to keep equal, and nothing is gained.
        boolean isEven = number % 2 == 0;

        JOptionPane.showMessageDialog(null,
                number + " er partall: " + isEven);
    }
}
