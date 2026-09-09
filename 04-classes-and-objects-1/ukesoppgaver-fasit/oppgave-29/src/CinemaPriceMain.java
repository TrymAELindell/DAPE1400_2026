// Reference solution for exercise 29: the returned age feeds the price
// decision in main.
public class CinemaPriceMain {
    public static void main(String[] args) {
        CinemaGuest guest1 = new CinemaGuest("Randi Berg", 1955);
        CinemaGuest guest2 = new CinemaGuest("Amir Said", 1991);

        int age1 = guest1.calculateAge();
        int price1;
        if (age1 >= 67) {
            price1 = 120;
        } else {
            price1 = 150;
        }
        System.out.println(guest1.getName() + " er " + age1 + " år og betaler " + price1 + " kr.");

        int age2 = guest2.calculateAge();
        int price2;
        if (age2 >= 67) {
            price2 = 120;
        } else {
            price2 = 150;
        }
        System.out.println(guest2.getName() + " er " + age2 + " år og betaler " + price2 + " kr.");
    }
}
