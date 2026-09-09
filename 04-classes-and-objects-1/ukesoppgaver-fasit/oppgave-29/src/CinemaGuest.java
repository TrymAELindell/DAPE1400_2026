// Reference solution for exercise 29.
//
// calculateAge returns the age instead of printing it, so main can use the
// value in the price decision. A void method that printed the whole line
// itself - age, price and all - would also work, but then the if/else and
// the pricing rule move inside CinemaGuest, and the age is locked up where
// nothing else can use it. Plain variables and if/else (module 03) would
// also handle two guests, at the cost of writing the age arithmetic and the
// decision twice, once per guest.
public class CinemaGuest {
    private String name;
    private int birthYear;

    private int currentYear = 2026;

    public CinemaGuest(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int calculateAge() {
        return this.currentYear - this.birthYear;
    }

    public String getName() {
        return this.name;
    }
}
