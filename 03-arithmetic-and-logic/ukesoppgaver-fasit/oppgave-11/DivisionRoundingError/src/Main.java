// Reference solution for exercise 11.
public class Main {
    public static void main(String[] args) {
        double number1 = 1;
        double number2 = 49;

        double quotient = number1 / number2;
        double product = quotient * number2;

        System.out.println(quotient);   // 0.02040816326530612
        System.out.println(product);    // 0.9999999999999999 - not 1.0
    }
}
