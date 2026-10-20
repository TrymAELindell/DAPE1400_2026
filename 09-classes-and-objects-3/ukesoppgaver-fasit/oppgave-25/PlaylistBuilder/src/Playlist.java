import java.util.ArrayList;

// Reference solution for exercise 25: a playlist with overloaded constructors, overloaded addSong and toString.
public class Playlist {
    private String name;
    private ArrayList<String> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Stores the list it is given, not a copy of it.
    public Playlist(String name, ArrayList<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void addSong(int index, String song) {
        songs.add(index, song);
    }

    public String getSong(int index) {
        return songs.get(index);
    }

    public int getNumberOfSongs() {
        return songs.size();
    }

    public String toString() {
        return "Spilleliste: «" + name + "», antall sanger: " + songs.size();
    }
}
