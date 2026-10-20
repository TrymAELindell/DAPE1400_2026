// Reference solution for exercise 36 (Del 3): print one plain cake and one wedding cake.
public class Main {
    public static void main(String[] args) {
        Cake chocolateCake = new Cake("Sjokoladekake", 350);
        WeddingCake weddingCake = new WeddingCake("Marsipankake", 450, 3);
        System.out.println(chocolateCake);
        System.out.println(weddingCake);
    }
}
