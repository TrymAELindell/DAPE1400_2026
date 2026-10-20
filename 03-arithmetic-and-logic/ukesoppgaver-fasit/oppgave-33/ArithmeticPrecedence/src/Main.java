// Reference solution for exercise 33.
public class Main {
    public static void main(String[] args) {
        double number1 = 1;
        double number2 = 2;
        double result;

        // Step by step, following the order of operations:
        //   parentheses first:
        //     (number2 * 2 + number1) = (2.0 * 2 + 1.0) = 5.0
        //     (number2 - number1 * 3) = (2.0 - 3.0)     = -1.0
        //   then multiplication and division, left to right:
        //     number1 * 4 = 4.0
        //     5.0 / -1.0  = -5.0
        //   then addition:
        //     4.0 + -5.0  = -1.0
        result = number1 * 4 + (number2 * 2 + number1) / (number2 - number1 * 3);
        System.out.println(result);   // -1.0
    }
}
