// Reference solution for exercise 35 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. lunch og dinner refererer til den samme
// pizzaen, så begge linjene viser 40 cm.
public class Main {
    public static void main(String[] args) {
        Pizza lunch = new Pizza("Margherita", 30);
        Pizza dinner = lunch;
        dinner.setDiameter(40);

        System.out.println(lunch);
        System.out.println("Middag: " + dinner);
    }
}
