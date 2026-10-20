import javax.swing.JOptionPane;

// Reference solution for exercise 46.
public class Main {
    public static void main(String[] args) {
        String amountInput = JOptionPane.showInputDialog("Hvor mange kroner skal deles?");
        String peopleInput = JOptionPane.showInputDialog("Hvor mange personer skal dele?");

        int amount;
        try {
            amount = Integer.parseInt(amountInput);
        } catch (Exception e) {
            amount = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — beløpet er satt til 0 kr");
        }

        int people;
        try {
            people = Integer.parseInt(peopleInput);
        } catch (Exception e) {
            // Backup value 1, not 0: the program divides by this number.
            people = 1;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall personer er satt til 1");
        }

        // Integer division and modulus are two halves of the same
        // calculation. The task asks for exactly those two parts, the whole
        // kroner each and what is left over. Dividing in double and casting
        // the result to int would give the same 333. But the program would
        // then need a second calculation to find the leftover. And the task
        // never wanted the decimals from the double division.
        int perPerson = amount / people;
        int leftover = amount % people;

        JOptionPane.showMessageDialog(null, "Hver person får " + perPerson
                + " kr, og " + leftover + " kr blir liggende igjen.");
    }
}
