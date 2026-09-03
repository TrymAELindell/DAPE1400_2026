// Reference solution for exercise 18.
public class DecimalDivisionWithCast {
    public static void main(String[] args) {
        int distance = 7;
        int hours = 2;

        // Both operands are int, so the integer division happens first and
        // the decimals are already gone when the 3 is widened into the
        // double. Declaring the variable as a double does not help.
        double speedWithoutCast = distance / hours;

        // Casting one operand first makes it a decimal division.
        double speedWithCast = (double) distance / hours;

        System.out.println(speedWithoutCast);   // 3.0
        System.out.println(speedWithCast);      // 3.5
    }
}
