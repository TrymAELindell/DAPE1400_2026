// Reference solution for extra exercise 4. The exercise is an exploration, so
// this program demonstrates the behaviors and the comments explain them —
// there is no single correct output.
public class DataTypeExploration {
    public static void main(String[] args) {
        // --- Dividing two int variables ---
        // int division throws away the decimals: the result is an int.
        int numerator = 7;
        int denominator = 2;
        System.out.println("7 / 2 = " + (numerator / denominator));   // 3, not 3.5

        // When the denominator is largest the true answer is below 1,
        // so int division gives 0:
        System.out.println("2 / 7 = " + (denominator / numerator));   // 0

        // Even when the answer "should" be a decimal number, int / int
        // stays an int. To get 3.5 the values must be doubles:
        double decimalNumerator = 7.0;
        double decimalDenominator = 2.0;
        System.out.println("7.0 / 2.0 = " + (decimalNumerator / decimalDenominator));   // 3.5

        // --- int overflow ---
        // Going past the largest int value does not crash the program.
        // The value silently wraps around to the smallest value — a classic
        // source of bugs that do not announce themselves:
        System.out.println("Integer.MAX_VALUE:     " + Integer.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE + 1: " + (Integer.MAX_VALUE + 1));   // wraps to MIN_VALUE
        System.out.println("Integer.MIN_VALUE:     " + Integer.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE - 1: " + (Integer.MIN_VALUE - 1));   // wraps to MAX_VALUE

        // --- byte, short and long ---
        // They store whole numbers just like int, only with other sizes.
        // But arithmetic on the small types behaves surprisingly:
        byte smallNumber1 = 100;
        byte smallNumber2 = 27;
        // byte sum = smallNumber1 + smallNumber2;   // compile error!
        // Java converts bytes (and shorts) to int before doing arithmetic,
        // so the result of byte + byte is an int, and an int does not fit
        // in a byte variable. Printing the sum directly works fine, because
        // then the int result is just printed:
        System.out.println("100 + 27 som byte gir int-en " + (smallNumber1 + smallNumber2));

        // --- float vs double ---
        // float holds about 7 significant digits, double about 15-16.
        // Both are approximations — the extra digits of the float print-out
        // below are simply wrong:
        float lessPrecise = 1.123456789123456789f;
        double morePrecise = 1.123456789123456789;
        System.out.println("float:  " + lessPrecise);
        System.out.println("double: " + morePrecise);

        // --- Concatenating two chars ---
        // + between two chars does NOT build a String. A char is stored as
        // a number (its character code), and + adds the codes as ints:
        char firstLetter = 't';
        char secondLetter = 'e';
        System.out.println("'t' + 'e' = " + (firstLetter + secondLetter));   // 217

        // To join them as text, bring a String into the expression — then +
        // means concatenation:
        System.out.println("\"\" + 't' + 'e' = " + ("" + firstLetter + secondLetter));   // te
    }
}
