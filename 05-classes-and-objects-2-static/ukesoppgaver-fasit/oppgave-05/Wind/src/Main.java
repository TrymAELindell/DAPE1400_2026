// Reference solution for exercise 5.
public class Main {
    public static void main(String[] args) {
        Wind breeze = new Wind(15);
        Wind storm = new Wind(130);

        System.out.println("Vindhastighet: " + breeze.getWindSpeed() + " km/t");
        System.out.println("Vindstille: " + breeze.isCalm());
        System.out.println("Orkan: " + breeze.isHurricane());
        System.out.println("Knop: " + breeze.getKnots());
        System.out.println("Beaufort: " + breeze.getBeaufort());

        System.out.println("\nVindhastighet: " + storm.getWindSpeed() + " km/t");
        System.out.println("Vindstille: " + storm.isCalm());
        System.out.println("Orkan: " + storm.isHurricane());
        System.out.println("Knop: " + storm.getKnots());
        System.out.println("Beaufort: " + storm.getBeaufort());
    }
}
