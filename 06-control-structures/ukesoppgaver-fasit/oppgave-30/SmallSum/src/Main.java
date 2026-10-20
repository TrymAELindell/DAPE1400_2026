// Reference solution for exercise 30.
//
// Koden fra oppgaven, gjort kjørbar. Grensen i < 5 holder selve 5 utenfor
// summen, så summen blir 1 + 2 + 3 + 4 = 10.
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 5; i++) {
            sum += i;
        }
        System.out.println("Summen er " + sum);
    }
}
