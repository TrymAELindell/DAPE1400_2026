import java.util.ArrayList;

// Reference solution for exercise 26: two playlists that get the same list.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> sharedSongs = new ArrayList<String>();
        Playlist roadTrip = new Playlist("Roadtrip", sharedSongs);
        Playlist beachParty = new Playlist("Strandfest", sharedSongs);

        roadTrip.addSong("Sommerfuggel i vinterland");

        // Begge linjene viser 1 sang. De to spillelistene refererer til det
        // samme listeobjektet.
        System.out.println(roadTrip);
        System.out.println(beachParty);
    }
}
