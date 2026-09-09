import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 43. Dialog-based, so it is checked by hand.
//
// Fasit comment (the choice): this solution stores the five throws in
// an array and prints it with a backwards for loop, because all five
// throws must be kept until the input is done. Another good solution
// is a string that each new throw is put in front of; the string can
// only be printed, and the numbers themselves are lost for any later
// sum or comparison.
public class ReverseThrows {
    public static void main(String[] args) {
        int[] throwValues = new int[5];

        for (int i = 0; i < throwValues.length; i++) {
            String input = showInputDialog("Skriv inn terningkast nummer " + (i + 1) + ":");
            throwValues[i] = Integer.parseInt(input);
        }

        for (int i = throwValues.length - 1; i >= 0; i--) {
            System.out.println(throwValues[i]);
        }
    }
}
