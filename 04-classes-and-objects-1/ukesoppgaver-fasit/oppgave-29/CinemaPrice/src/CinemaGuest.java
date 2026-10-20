// Reference solution for exercise 29.
//
// calculateAge returns the age instead of printing it, so main can use the
// value in the price decision. A void method that printed the whole line
// itself, with age and price, would also work. But then the if/else and the
// pricing rule move inside CinemaGuest. The age is then hidden where no
// other code can use it. Plain variables and if/else (module 03) would also
// handle two guests. The cost is that the age arithmetic and the decision
// are written twice, once per guest.
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
