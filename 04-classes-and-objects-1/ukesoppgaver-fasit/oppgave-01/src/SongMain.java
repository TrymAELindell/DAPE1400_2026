// Reference solution for exercise 1: assigning fields directly with the dot.
// This works, but nothing forces the fields to be set - which is exactly
// the hole the constructor exercises close.
public class SongMain {
    public static void main(String[] args) {
        Song song = new Song();
        song.title = "Nordnorsk vise";
        song.artist = "Halvdan Sivertsen";

        System.out.println("Tittel: " + song.title);
        System.out.println("Artist: " + song.artist);
    }
}
