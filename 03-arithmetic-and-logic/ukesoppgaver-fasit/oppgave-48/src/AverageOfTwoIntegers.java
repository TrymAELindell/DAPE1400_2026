import javax.swing.JOptionPane;

// Reference solution for exercise 48.
public class AverageOfTwoIntegers {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Skriv inn det første heltallet");
        String input2 = JOptionPane.showInputDialog("Skriv inn det andre heltallet");

        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);

        // The inputs are whole numbers and are stored as such; only the answer
        // needs decimals, so one operand is cast at the division. Reading both
        // numbers as double instead - the module 02 way - also gives 7.5, but
        // then the program would echo "7.0 og 8.0" back to a user who typed
        // two whole numbers.
        double average = (double) (number1 + number2) / 2;

        JOptionPane.showMessageDialog(null, "Gjennomsnittet av " + number1
                + " og " + number2 + " er " + average);
    }
}
