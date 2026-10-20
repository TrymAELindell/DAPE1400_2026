// Reference solution for exercise 29. Only version B is in this file, because
// version A crashes: Double.parseDouble("to") throws a NumberFormatException,
// the program stops on that line, and the print below never runs.
public class Main {
    public static void main(String[] args) {
        String input = "to";

        double number;
        try {
            number = Double.parseDouble(input);
        } catch (Exception e) {
            number = 0;
        }

        System.out.println("Tallet er " + number);   // Tallet er 0.0
    }
}
