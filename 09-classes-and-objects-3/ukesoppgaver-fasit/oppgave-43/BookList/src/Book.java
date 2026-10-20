// Reference solution for exercise 43 (Del 3): a book that describes itself with toString.
public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return "«" + title + "» av " + author + " (" + numberOfPages + " sider)";
    }
}
