// Reference solution for exercise 31.
public class Main {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 4;

        // The parentheses around each comparison are needed because +
        // (string concatenation) would otherwise run before the comparison.
        System.out.println("number1 == number2 : " + (number1 == number2));   // false
        System.out.println("number1 != number2 : " + (number1 != number2));   // true
        System.out.println("number1 <= number2 : " + (number1 <= number2));   // false
        System.out.println("number1 >= number2 : " + (number1 >= number2));   // true
        System.out.println("number1 <  number2 : " + (number1 < number2));    // false
        System.out.println("number1 >  number2 : " + (number1 > number2));    // true
    }
}
