import java.util.ArrayList;

// Reference solution for exercise 32 (Del 2): each team gets its own copy of the player list.
public class Team {
    private String name;
    private ArrayList<String> players;

    public Team(String name, ArrayList<String> players) {
        this.name = name;
        // En ny liste for hvert lag. Å lagre referansen fra parameteren ville
        // gitt begge lagene den samme lista.
        this.players = new ArrayList<>();
        for (String player : players) {
            this.players.add(player);
        }
    }

    public void addPlayer(String player) {
        players.add(player);
    }

    public int getNumberOfPlayers() {
        return players.size();
    }
}
