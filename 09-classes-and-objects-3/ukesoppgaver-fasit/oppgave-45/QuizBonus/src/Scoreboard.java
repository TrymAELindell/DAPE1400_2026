// Reference solution for exercise 45 (Del 3): give bonus points and print the scores.
public class Scoreboard {

    // En array med Player-objekter og en metode som gir alle bonus, passer her.
    // Metoden får en referanse til arrayen og endrer objektene i den, så den
    // trenger ikke returnere noe.
    // To arrayer, én med navn og én med poeng, ville også virket. Men da hører
    // hver spiller til to arrayer, og indeksene må holdes like for hånd.
    // En metode som returnerer nye poeng i stedet, ville også virket, men da må
    // main legge hver nye verdi tilbake selv.
    public static void giveBonus(Player[] players, int bonus) {
        for (Player player : players) {
            player.addPoints(bonus);
        }
    }

    public static void printScores(Player[] players) {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
