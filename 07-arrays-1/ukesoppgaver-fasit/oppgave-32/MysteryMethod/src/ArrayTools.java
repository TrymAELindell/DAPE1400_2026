// Reference solution for exercise 32.
//
// Metoden fra oppgaven. Den finner og returnerer det minste tallet i arrayen.
public class ArrayTools {
    public static int mystery(int[] numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }
}
