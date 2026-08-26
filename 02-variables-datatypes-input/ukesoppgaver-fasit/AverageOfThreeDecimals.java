import javax.swing.JOptionPane;

// Reference solution for exercise 8.
public class AverageOfThreeDecimals {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String input2 = JOptionPane.showInputDialog("Skriv inn det andre desimaltallet");
        String input3 = JOptionPane.showInputDialog("Skriv inn det tredje desimaltallet");

        double number1 = Double.parseDouble(input1);
        double number2 = Double.parseDouble(input2);
        double number3 = Double.parseDouble(input3);

        double sum = number1 + number2 + number3;
        // sum is a double, so dividing by 3.0 gives a decimal result.
        double average = sum / 3.0;

        String output = "Summen av de tre tallene er " + sum
                + "\nGjennomsnittet er " + average;
        JOptionPane.showMessageDialog(null, output);
        System.out.println(output);
    }
}
