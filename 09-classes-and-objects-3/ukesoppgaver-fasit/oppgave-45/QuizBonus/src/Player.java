// Reference solution for exercise 45 (Del 3): a quiz player with a name and a score.
public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addPoints(int points) {
        score += points;
    }

    public String toString() {
        return name + ": " + score + " poeng";
    }
}
