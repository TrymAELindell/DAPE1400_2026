// Reference solution for exercise 17.
public class LongToInt {
    public static void main(String[] args) {
        double decimalNumber = 3.9;
        int wholeNumber = (int) decimalNumber;

        System.out.println(decimalNumber);   // 3.9
        System.out.println(wholeNumber);     // 3
        System.out.println((int) -3.9);      // -3

        long tooBig = 3000000000L;

        // 3 billion does not fit in an int, so the value wraps around the
        // same way it did in module 02.
        int shrunk = (int) tooBig;

        System.out.println(tooBig);   // 3000000000
        System.out.println(shrunk);   // -1294967296
    }
}
