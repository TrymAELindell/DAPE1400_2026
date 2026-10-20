import javax.swing.JOptionPane;

// Reference solution for exercise 21.
public class Main {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Skriv inn det første tallet");
        String input2 = JOptionPane.showInputDialog("Skriv inn det andre tallet");

        int number1;
        int number2;
        try {
            number1 = Integer.parseInt(input1);
            number2 = Integer.parseInt(input2);
        } catch (Exception e) {
            number1 = 0;
            number2 = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn heltall — begge tallene er satt til 0");
        }

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
