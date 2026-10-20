import javax.swing.JOptionPane;

// Reference solution for exercise 4.
public class Main {
    public static void main(String[] args) {
        String fahrenheitInput = JOptionPane.showInputDialog("Hvor mange grader fahrenheit?");
        double fahrenheit;
        try {
            fahrenheit = Double.parseDouble(fahrenheitInput);
        } catch (Exception e) {
            fahrenheit = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — temperaturen er satt til 0 grader fahrenheit");
        }

        // The parentheses matter: the subtraction must happen before the
        // division, so we cannot rely on the default order of operations.
        double celsius = (fahrenheit - 32) / 1.8;

        JOptionPane.showMessageDialog(null,
                fahrenheit + " grader fahrenheit er " + celsius + " grader celsius");
    }
}
