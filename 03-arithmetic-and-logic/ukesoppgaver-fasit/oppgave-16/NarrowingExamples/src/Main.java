// Reference solution for exercise 16.
public class Main {
    public static void main(String[] args) {
        double decimalNumber = 3.9;

        // Narrowing has to be written out, and it cuts the decimals away
        // instead of rounding.
        int wholeNumber = (int) decimalNumber;

        System.out.println(decimalNumber);   // 3.9 - the source is untouched
        System.out.println(wholeNumber);     // 3
        System.out.println((int) -3.9);      // -3, cut towards zero
    }
}
