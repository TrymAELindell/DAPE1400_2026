// Reference solution for exercise 20.
public class ComparisonOperators {
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 7;

        boolean equal = number1 == number2;
        boolean notEqual = number1 != number2;
        boolean lessOrEqual = number1 <= number2;
        boolean greaterOrEqual = number1 >= number2;
        boolean less = number1 < number2;
        boolean greater = number1 > number2;

        System.out.println("number1 == number2 : " + equal);            // true
        System.out.println("number1 != number2 : " + notEqual);         // false
        System.out.println("number1 <= number2 : " + lessOrEqual);      // true
        System.out.println("number1 >= number2 : " + greaterOrEqual);   // true
        System.out.println("number1 <  number2 : " + less);             // false
        System.out.println("number1 >  number2 : " + greater);          // false
    }
}
