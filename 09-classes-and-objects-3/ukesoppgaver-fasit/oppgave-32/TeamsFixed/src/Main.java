import java.util.ArrayList;

// Reference solution for exercise 32 (Del 2): two teams that start with the same players.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> startingPlayers = new ArrayList<>();
        startingPlayers.add("Ola");
        startingPlayers.add("Kari");

        Team red = new Team("Rødt lag", startingPlayers);
        Team blue = new Team("Blått lag", startingPlayers);

        red.addPlayer("Amir");

        System.out.println("Rødt lag: " + red.getNumberOfPlayers());
        System.out.println("Blått lag: " + blue.getNumberOfPlayers());
    }
}
