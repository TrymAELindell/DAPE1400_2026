import javax.swing.JOptionPane;

// Reference solution for exercise 16.
public class AverageWithTryCatchPerInput {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String input2 = JOptionPane.showInputDialog("Skriv inn det andre desimaltallet");
        String input3 = JOptionPane.showInputDialog("Skriv inn det tredje desimaltallet");

        // One try-catch per input, so a single bad input only affects that one
        // input. In exercise 14 all three were thrown away together.
        //
        // Keeping the good values and setting the bad to 0 still gives us a problem: the
        // average is still divided by three, so a substituted 0 drags it down
        // and the result looks perfectly valid. The report string below lets
        // warn the user, every substitution is named in the
        // final message, not only in a dialog the user has already clicked
        // away. Exercise 30 is the same mistake left unfixed.
        String report = "";

        double number1;
        try {
            number1 = Double.parseDouble(input1);
        } catch (Exception e) {
            number1 = 0;
            report = report + "Det første tallet var ikke et tall og er regnet som 0.\n";
        }

        double number2;
        try {
            number2 = Double.parseDouble(input2);
        } catch (Exception e) {
            number2 = 0;
            report = report + "Det andre tallet var ikke et tall og er regnet som 0.\n";
        }

        double number3;
        try {
            number3 = Double.parseDouble(input3);
        } catch (Exception e) {
            number3 = 0;
            report = report + "Det tredje tallet var ikke et tall og er regnet som 0.\n";
        }

        double sum = number1 + number2 + number3;
        double average = sum / 3.0;

        String output = report
                + "Summen av de tre tallene er " + sum
                + "\nGjennomsnittet er " + average;
        JOptionPane.showMessageDialog(null, output);
        System.out.println(output);
    }
}
