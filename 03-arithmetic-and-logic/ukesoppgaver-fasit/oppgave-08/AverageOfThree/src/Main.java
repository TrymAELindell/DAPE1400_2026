// Reference solution for exercise 8.
public class Main {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 5;
        int number3 = 9;

        // The parentheses force the addition to happen before the division,
        // and the 3.0 makes the division a decimal one.
        double average = (number1 + number2 + number3) / 3.0;

        System.out.println("Gjennomsnittet er " + average);   // 6.0
    }
}
