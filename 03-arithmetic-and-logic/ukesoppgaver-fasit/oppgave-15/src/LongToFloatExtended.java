// Reference solution for exercise 15.
public class LongToFloatExtended {
    public static void main(String[] args) {
        long bigInteger = Long.MAX_VALUE;
        float bigIntegerAsFloat = bigInteger;

        System.out.println(bigInteger);          // 9223372036854775807
        System.out.println(bigIntegerAsFloat);   // 9.223372E18

        // The L suffix makes the literal a long; without it Java reads it as
        // an int, and the value is too large for one.
        long distanceInMeters = 12345678910L;
        float distanceAsFloat = distanceInMeters;

        System.out.println(distanceInMeters);   // 12345678910
        System.out.println(distanceAsFloat);    // 1.2345679E10
    }
}
