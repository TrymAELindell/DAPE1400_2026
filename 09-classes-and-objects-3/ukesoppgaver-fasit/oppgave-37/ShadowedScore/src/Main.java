// Reference solution for exercise 37 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. Den skriver ut 6, 10 og 10.
public class Main {
    public static void main(String[] args) {
        Player player = new Player(10);
        player.addBonus();
        System.out.println(player.getScore());
    }
}
