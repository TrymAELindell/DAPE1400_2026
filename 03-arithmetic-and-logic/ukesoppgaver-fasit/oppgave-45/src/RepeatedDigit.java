import javax.swing.JOptionPane;

// Reference solution for exercise 45.
public class RepeatedDigit {
    public static void main(String[] args) {
        String digit = JOptionPane.showInputDialog("Skriv inn ett siffer (0-9)");

        // Putting a digit three times side by side is text work, not
        // arithmetic, so the input stays a string and concatenation from
        // module 02 does the whole job. Parsing the digit and multiplying by
        // 111 also produces 777, but it only works because the value is a
        // single digit: the same program breaks the moment someone types 12.
        String repeated = digit + digit + digit;

        JOptionPane.showMessageDialog(null,
                "Du skrev " + digit + ". Tre ganger på rad blir det " + repeated + ".");
    }
}
