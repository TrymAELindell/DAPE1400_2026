import static javax.swing.JOptionPane.*;

// Reference solution for exercise 11.
public class SumOfTwoIntegers {
    public static void main(String[] args) {
        String input1 = showInputDialog("Skriv inn det første heltallet");
        String input2 = showInputDialog("Skriv inn det andre heltallet");

        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);

        // The arithmetic happens here, before the message is built. In the
        // message below every + is concatenation, because the expression
        // already contains text.
        int sum = number1 + number2;
        int product = number1 * number2;

        showMessageDialog(null, number1 + " + " + number2 + " = " + sum
                + "\n" + number1 + " * " + number2 + " = " + product);
    }
}
