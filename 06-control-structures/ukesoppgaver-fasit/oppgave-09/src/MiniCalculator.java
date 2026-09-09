import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 9: a switch where every case executes a
// statement — nothing is returned.
public class MiniCalculator {
    public static void main(String[] args) {
        String firstInput = showInputDialog("Skriv inn det første tallet:");
        double first = Double.parseDouble(firstInput);

        String secondInput = showInputDialog("Skriv inn det andre tallet:");
        double second = Double.parseDouble(secondInput);

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
