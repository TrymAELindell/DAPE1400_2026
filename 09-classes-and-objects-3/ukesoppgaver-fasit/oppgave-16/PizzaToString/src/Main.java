// Reference solution for exercise 16: print two pizzas with toString.
public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza("Margherita", 40);
        Pizza pepperoni = new Pizza("Pepperoni");

        System.out.println(margherita);
        System.out.println(pepperoni);
        System.out.println("Dagens pizza: " + pepperoni);
    }
}
