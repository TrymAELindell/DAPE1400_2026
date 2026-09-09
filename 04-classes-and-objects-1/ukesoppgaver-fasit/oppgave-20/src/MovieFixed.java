// Reference solution for exercise 20 (find the bug): the broken version
// assigned in a cross - this.title = director and this.director = title.
// The call site was fine; the swap happened inside the constructor.
public class MovieFixed {
    private String title;
    private String director;

    public MovieFixed(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void printMovieInfo() {
        System.out.println("Tittel: " + this.title);
        System.out.println("Regissør: " + this.director);
    }
}
