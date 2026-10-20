// Reference solution for exercise 45 (Del 3): the scores before and after the bonus.
public class Main {
    public static void main(String[] args) {
        Player[] players = {
            new Player("Aisha", 40),
            new Player("Jonas", 25),
            new Player("Mia", 55)
        };

        Scoreboard.printScores(players);
        Scoreboard.giveBonus(players, 10);
        System.out.println("Etter bonus:");
        Scoreboard.printScores(players);
    }
}
