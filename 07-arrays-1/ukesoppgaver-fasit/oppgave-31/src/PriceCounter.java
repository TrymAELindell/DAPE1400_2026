// Reference solution for exercise 31: the snippet from the handout, runnable. Only 120.0
// and 200.0 pass the condition.
public class PriceCounter {
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
