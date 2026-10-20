// Reference solution for exercise 24: sum the prices and apply a 25 percent discount.
public class Main {
    public static void main(String[] args) {
        // total får en startverdi, og discount er flyttet ut av blokka.
        double total = 0;
        double discount = 0.25;

        double[] prices = {120.0, 80.0, 200.0};
        for (double price : prices) {
            total += price;
        }
        System.out.println("Sum: " + total);
        System.out.println("Med rabatt: " + total * (1 - discount));
    }
}
