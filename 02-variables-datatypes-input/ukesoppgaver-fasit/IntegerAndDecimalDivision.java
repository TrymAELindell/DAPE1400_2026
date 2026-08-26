// Reference solution for exercise 32 - the snippet the exercise asks about.
public class IntegerAndDecimalDivision {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        // Both sides are whole numbers, so the decimals are thrown away.
        System.out.println(a / b);          // 3

        double c = 7;
        double d = 2;
        System.out.println(c / d);          // 3.5

        // double is precise, but not exact: 0.1 and 0.2 cannot be stored
        // exactly in a finite number of bits.
        System.out.println(0.1 + 0.2);      // 0.30000000000000004
    }
}
