import java.util.ArrayList;

// Reference solution for exercise 49 (Del 4): the café's shelf of board games.
public class Shelf {
    private ArrayList<Game> games;

    public Shelf() {
        this.games = new ArrayList<>();
    }

    public void addGame(String name) {
        games.add(new Game(name));
    }

    // Assumption: the café has one copy of each game, so a game is found by
    // its name. Kari talks about "the game", never about several copies.
    public Game findGame(String name) {
        for (Game game : games) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    public String lendGame(String name, int tableNumber) {
        Game game = findGame(name);
        if (game == null) {
            return "Fant ikke " + name + " i hylla";
        }
        // Assumption: a game that is at a table cannot be lent to another
        // table. It has to come back to the shelf first.
        if (!game.isAvailable()) {
            return name + " er allerede lånt ut";
        }
        game.lendTo(new Table(tableNumber));
        return name + " er lånt ut til bord " + tableNumber;
    }

    public String returnGame(String name) {
        Game game = findGame(name);
        if (game == null) {
            return "Fant ikke " + name + " i hylla";
        }
        game.returnToShelf();
        return name + " er tilbake i hylla";
    }

    public String toString() {
        String overview = "";
        for (Game game : games) {
            overview += game + "\n";
        }
        return overview;
    }
}
