// Reference solution for exercise 11.
//
// Loop-variabelen holder en kopi av elementet, så arrayen blir ikke endret.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        for (int number : numbers) {
            number = number * 2;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
