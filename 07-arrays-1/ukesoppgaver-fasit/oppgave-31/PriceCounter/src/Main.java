// Reference solution for exercise 31.
//
// Koden fra oppgaven, gjort kjørbar. Bare 120.0 og 200.0 oppfyller
// betingelsen.
public class Main {
    public static void main(String[] args) {
        double[] prices = {49.9, 120.0, 15.5, 200.0};
        int count = 0;

        for (double price : prices) {
            if (price > 50) {
                count++;
            }
        }

        System.out.println(count + " varer koster mer enn 50 kr");
    }
}
