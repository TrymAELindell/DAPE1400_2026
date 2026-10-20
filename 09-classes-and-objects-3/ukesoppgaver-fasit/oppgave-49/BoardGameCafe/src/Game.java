// Reference solution for exercise 49 (Del 4): a board game that is on the shelf or at a table.
public class Game {
    private String name;
    // The table that has the game, or null while the game is on the shelf.
    private Table table;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return table == null;
    }

    public void lendTo(Table table) {
        this.table = table;
    }

    public void returnToShelf() {
        table = null;
    }

    public String toString() {
        if (table == null) {
            return name + ": ledig";
        }
        return name + ": " + table;
    }
}
