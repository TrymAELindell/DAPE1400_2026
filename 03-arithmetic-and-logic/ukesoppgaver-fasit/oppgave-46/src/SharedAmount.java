import javax.swing.JOptionPane;

// Reference solution for exercise 46.
public class SharedAmount {
    public static void main(String[] args) {
        String amountInput = JOptionPane.showInputDialog("Hvor mange kroner skal deles?");
        String peopleInput = JOptionPane.showInputDialog("Hvor mange personer skal dele?");

        int amount = Integer.parseInt(amountInput);
        int people = Integer.parseInt(peopleInput);

        // Integer division and modulus are two halves of the same calculation,
        // and that is exactly what the task asks for: whole kroner each, and
        // what is left over. Dividing in double and casting the result to int
        // would give the same 333, but the leftover would then have to be
        // reconstructed with a second calculation from a value whose decimals
        // were never wanted in the first place.
        int perPerson = amount / people;
        int leftover = amount % people;

        JOptionPane.showMessageDialog(null, "Hver person får " + perPerson
                + " kr, og " + leftover + " kr blir liggende igjen.");
    }
}
