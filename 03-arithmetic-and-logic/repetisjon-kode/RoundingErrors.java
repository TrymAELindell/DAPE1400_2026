public class RoundingErrors {
    public static void main(String[] args) {
        // Arithmetic with decimal-number variables can sometimes produce
        // rounding errors. The reason is that only a limited number of
        // bits (32 for float, 64 for double) is available to represent
        // numbers, while there are infinitely many decimal numbers —
        // infinitely many between any two numbers, in fact.

        // It can be a little unpredictable when the problem shows up.
        // Below we perform a calculation that results in a rounding error.

        // The idea: divide one number by another, then multiply the
        // result by the number we divided by. Since that just reverses
        // the division, we should get the original number back — but
        // because of the computer's limitations, we do not.
        System.out.println("Avrundingsfeil via divisjon");
        double number1 = 1; // the numerator
        System.out.println("Original tall: " + number1); // print the numerator so we see what was stored
        double number2 = 49; // the denominator

        double quotient = number1 / number2; // perform the division

        double product = quotient * number2;
        System.out.println("Resultat av multiplikasjon: " + product); // the number we got when reversing the division
        boolean sameAsOriginal = number1 == product; // compare to see if we got the original numerator back
        System.out.println("Fikk vi det originale tallet tilbake: " + sameAsOriginal);


        // double and float can only represent a limited number of digits.
        // Sometimes this shows up as the variable cutting away digits
        // after the decimal point. The examples below illustrate this.
        System.out.println("\nAvrundingsfeil via upresis representasjon");

        // We can watch small values disappear by taking a large number —
        // here 9 * 10^15 — adding a small decimal number, and then
        // subtracting the large number again:
        double veryLargeDouble = (9E15 + 0.6) - 9E15;
        System.out.println(veryLargeDouble); // prints 1.0 because 0.6 was rounded up
        veryLargeDouble = (9E15 + 0.4) - 9E15;
        System.out.println(veryLargeDouble); // prints 0.0 because 0.4 was rounded down
        // Small decimal values can disappear when the number is large.
        // This has to happen because not every number can be represented;
        // the lowest parts of the number are cut away because they matter
        // least for the calculation. It is more important that the bank
        // gets the millions right than the single kroner.

        // We can also see this clearly by printing the same digits
        // several times, moving the decimal point each time. The same
        // number of digits is printed every time, but with fewer and
        // fewer digits after the decimal point.
        // Note that the resolution — which numbers can be represented —
        // is not uniform across the range of a float or double.
        System.out.println("\nRunding av desimaler basert på tallstørrelse");
        double limitDouble;
        limitDouble = 1.2345678910121314151617181920;
        System.out.println(limitDouble);
        limitDouble = 12.345678910121314151617181920;
        System.out.println(limitDouble);
        limitDouble = 123.45678910121314151617181920;
        System.out.println(limitDouble);
        limitDouble = 1234567891012131415161718192021222324252627282930.0;
        System.out.println(limitDouble);
    }
}
