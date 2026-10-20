// Reference solution for exercise 36.
//
// Begge kodebitene fra oppgaven, gjort kjørbare. While-loopen tester før
// første runde og kjører null ganger, mens do-while-loopen tester etter
// runden og derfor får nøyaktig én runde her.
public class Main {
    public static void main(String[] args) {
        int number = 12;
        while (number < 10) {
            System.out.println("A: " + number);
            number++;
        }

        number = 12;
        do {
            System.out.println("B: " + number);
            number++;
        } while (number < 10);
    }
}
