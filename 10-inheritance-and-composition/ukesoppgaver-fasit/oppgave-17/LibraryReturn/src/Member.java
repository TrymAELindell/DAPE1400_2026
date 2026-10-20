// Reference solution for exercise 17: a member can borrow a book that exists on its own.
public class Member {
    private String name;
    private Book book;

    public Member(String name) {
        this.name = name;
    }

    public void borrow(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void returnBook() {
        this.book = null;
    }

    public String toString() {
        if (book == null) {
            return name + " har ingen bok";
        }
        return name + " har lånt " + book;
    }
}
