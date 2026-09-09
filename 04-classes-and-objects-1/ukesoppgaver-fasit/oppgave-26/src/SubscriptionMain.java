// Reference solution for exercise 26: prints
//   Til sammen per år: 6336.0 kr
//   false
public class SubscriptionMain {
    public static void main(String[] args) {
        Subscription music = new Subscription("Musikk", 129.0);
        Subscription training = new Subscription("Trening", 399.0);
        double total = music.getYearlyPrice() + training.getYearlyPrice();
        System.out.println("Til sammen per år: " + total + " kr");
        System.out.println(music.getYearlyPrice() > training.getYearlyPrice());
    }
}
