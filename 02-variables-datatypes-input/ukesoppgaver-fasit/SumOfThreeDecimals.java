import javax.swing.JOptionPane;

// Reference solution for exercise 7.
public class SumOfThreeDecimals {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String input2 = JOptionPane.showInputDialog("Skriv inn det andre desimaltallet");
        String input3 = JOptionPane.showInputDialog("Skriv inn det tredje desimaltallet");

        double number1 = Double.parseDouble(input1);
        double number2 = Double.parseDouble(input2);
        double number3 = Double.parseDouble(input3);

        double sum = number1 + number2 + number3;
        System.out.println("Summen av de tre tallene er " + sum);
    }
}
