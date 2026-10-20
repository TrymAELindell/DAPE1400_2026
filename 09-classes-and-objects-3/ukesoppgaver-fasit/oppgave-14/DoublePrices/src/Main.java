// Reference solution for exercise 14: double the prices and one number.
public class Main {
    public static void main(String[] args) {
        int[] prices = {50, 120, 35};
        ArrayUtils.doubleAll(prices);

        for (int price : prices) {
            System.out.println(price);
        }
        System.out.println(ArrayUtils.doubleAll(21));
    }
}
