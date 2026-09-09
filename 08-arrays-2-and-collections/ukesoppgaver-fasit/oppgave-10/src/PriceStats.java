import java.util.ArrayList;
import java.util.Collections;

// Reference solution for exercise 10: the most and least expensive item on a menu of Double
// prices, with Collections.max and Collections.min.
public class PriceStats {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(39.0);
        prices.add(45.0);
        prices.add(52.0);
        prices.add(34.0);
        prices.add(61.0);

        System.out.println("Dyrest: " + Collections.max(prices) + " kr");
        System.out.println("Billigst: " + Collections.min(prices) + " kr");
    }
}
