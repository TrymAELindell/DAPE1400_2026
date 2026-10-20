// Reference solution for exercise 13.
public class Main {
    public static void main(String[] args) {
        int integerNumber = 15;
        // int -> long: widening, so Java does it without a cast.
        long longNumber = integerNumber;

        float floatNumber = 3.5F;
        // float -> double: widening in the same way.
        double doubleNumber = floatNumber;

        System.out.println(integerNumber);   // 15
        System.out.println(longNumber);      // 15
        System.out.println(floatNumber);     // 3.5
        System.out.println(doubleNumber);    // 3.5
    }
}
