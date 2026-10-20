// Reference solution for exercise 14.
public class Main {
    public static void main(String[] args) {
        long bigInteger = Long.MAX_VALUE;

        // Widening, and still lossy: a float has room for the magnitude but
        // not for every digit on the way there.
        float bigIntegerAsFloat = bigInteger;

        System.out.println(bigInteger);          // 9223372036854775807
        System.out.println(bigIntegerAsFloat);   // 9.223372E18
    }
}
