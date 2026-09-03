// Reference solution for exercise 12.
public class LargeNumberRounding {
    public static void main(String[] args) {
        double bigNumber = 9000000000000000.0;

        // There is no room for decimals at this magnitude: 0.6 is rounded up
        // to a whole 1, and 0.4 disappears entirely.
        System.out.println(bigNumber + 0.6);   // 9.000000000000001E15
        System.out.println(bigNumber + 0.4);   // 9.0E15
    }
}
