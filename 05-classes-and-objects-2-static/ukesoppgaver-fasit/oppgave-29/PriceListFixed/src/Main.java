// Reference solution for exercise 29: the corrected run.
public class Main {
    public static void main(String[] args) {
        System.out.println("Pris med moms: " + PriceListFixed.getPriceWithVAT(200.0));
        System.out.println("Moms alene: " + PriceListFixed.getVAT(200.0));
    }
}
