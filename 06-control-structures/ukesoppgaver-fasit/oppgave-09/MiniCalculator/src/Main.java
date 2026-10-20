import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 9: a switch where every case executes a
// statement — nothing is returned.
public class Main {
    public static void main(String[] args) {
        String firstInput = showInputDialog("Skriv inn det første tallet:");
        double first;
        try {
            first = Double.parseDouble(firstInput);
        } catch (Exception e) {
            first = 0;
            showMessageDialog(null, "Du skrev ikke inn et tall — det første tallet er satt til 0");
        }

        String secondInput = showInputDialog("Skriv inn det andre tallet:");
        double second;
        try {
            second = Double.parseDouble(secondInput);
        } catch (Exception e) {
            second = 0;
            showMessageDialog(null, "Du skrev ikke inn et tall — det andre tallet er satt til 0");
        }

        String operator = showInputDialog("Skriv inn regneoperasjonen (+, -, * eller /):");

        switch (operator) {
            case "+" -> System.out.println(first + " + " + second + " = " + (first + second));
            case "-" -> System.out.println(first + " - " + second + " = " + (first - second));
            case "*" -> System.out.println(first + " * " + second + " = " + (first * second));
            case "/" -> System.out.println(first + " / " + second + " = " + (first / second));
            default -> System.out.println("Ukjent regneoperasjon: " + operator);
        }
    }
}
