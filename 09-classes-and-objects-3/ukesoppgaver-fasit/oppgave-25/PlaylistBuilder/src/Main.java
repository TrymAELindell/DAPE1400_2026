import javax.swing.JOptionPane;

// Reference solution for exercise 25: fill a playlist from user input.
public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist("Mine favoritter");

        String song = JOptionPane.showInputDialog("Skriv inn en sang (eller ferdig for å avslutte):");
        while (song != null && !song.equals("ferdig")) {
            myPlaylist.addSong(song);
            song = JOptionPane.showInputDialog("Skriv inn en sang (eller ferdig for å avslutte):");
        }
        myPlaylist.addSong(0, "Intro");

        System.out.println(myPlaylist);
        System.out.println("Første sang: " + myPlaylist.getSong(0));
    }
}
