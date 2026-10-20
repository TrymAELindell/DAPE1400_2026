// Reference solution for exercise 34 (Del 2): toString spelled with a capital S.
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Metoden må hete toString, med stor S. Med navnet tostring bruker Java
    // den innebygde varianten, som gir Book@ og et tall.
    public String toString() {
        return "«" + title + "» av " + author;
    }
}
