import javax.swing.JOptionPane;

// Reference solution for exercise 44.
public class EvenCheck {
    public static void main(String[] args) {
        String numberInput = JOptionPane.showInputDialog("Skriv inn et heltall");
        int number = Integer.parseInt(numberInput);

        // The expected output is exactly the value of the logical
        // expression, so the expression is printed directly and no control
        // structure is needed at all. An if/else with one message per branch
        // gives the same output, but it writes the same sentence twice with
        // only "true" and "false" differing - two places to keep in step for
        // nothing gained.
        boolean isEven = number % 2 == 0;

        JOptionPane.showMessageDialog(null,
                number + " er partall: " + isEven);
    }
}
