// Reference solution for exercise 37 (Del 2): the player from the task.
public class Player {
    private int score;

    public Player(int score) {
        this.score = score;
    }

    public void addBonus() {
        // Den lokale variabelen score har samme navn som fieldet. Navnet
        // treffer den lokale variabelen, så fieldet endres aldri.
        int score = 5;
        score += 1;
        System.out.println(score);
        System.out.println(this.score);
    }

    public int getScore() {
        return score;
    }
}
