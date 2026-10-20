// Reference solution for exercise 22 (Del 2): two players, one of them a goalkeeper.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Goalkeeper();

        player1.describeRole();
        // player2 har typen Player, men objektet er en Goalkeeper. Derfor kjører
        // versjonen fra Goalkeeper.
        player2.describeRole();
    }
}
