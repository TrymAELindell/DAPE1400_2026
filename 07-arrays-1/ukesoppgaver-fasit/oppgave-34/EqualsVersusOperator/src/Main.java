import java.util.Arrays;

// Reference solution for exercise 34.
//
// Programmet fra oppgaven, gjort kjørbart. == sammenlikner referansene,
// mens Arrays.equals sammenlikner innholdet.
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(a == b);
        System.out.println(Arrays.equals(a, b));
    }
}
