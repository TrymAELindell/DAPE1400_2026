// Reference solution for exercise 6: one pizza from each constructor.
public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza("Margherita", 40);
        Pizza pepperoni = new Pizza("Pepperoni");

        System.out.println(margherita.getDescription());
        System.out.println(pepperoni.getDescription());
    }
}
