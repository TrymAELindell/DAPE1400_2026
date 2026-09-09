// Reference solution for exercise 26 (predict the output): a method with a
// return value can be used as an expression - added, compared, stored.
public class Subscription {
    private String name;
    private double monthlyPrice;

    public Subscription(String name, double monthlyPrice) {
        this.name = name;
        this.monthlyPrice = monthlyPrice;
    }

    public double getYearlyPrice() {
        return this.monthlyPrice * 12;
    }
}
