import javax.swing.JOptionPane;

// Reference solution for exercise 21.
public class ComparisonOperatorsWithInput {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Skriv inn det første tallet");
        String input2 = JOptionPane.showInputDialog("Skriv inn det andre tallet");

        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);

        boolean equal = number1 == number2;
        boolean notEqual = number1 != number2;
        boolean lessOrEqual = number1 <= number2;
        boolean greaterOrEqual = number1 >= number2;
        boolean less = number1 < number2;
        boolean greater = number1 > number2;

        System.out.println("number1 == number2 : " + equal);
        System.out.println("number1 != number2 : " + notEqual);
        System.out.println("number1 <= number2 : " + lessOrEqual);
        System.out.println("number1 >= number2 : " + greaterOrEqual);
        System.out.println("number1 <  number2 : " + less);
        System.out.println("number1 >  number2 : " + greater);
    }
}
