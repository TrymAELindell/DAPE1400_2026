// Reference solution for exercise 32 (Del 2): the fixed member.
public class Member {
    private String name;
    private Book book;

    public Member(String name) {
        this.name = name;
    }

    public void borrow(Book book) {
        this.book = book;
    }

    public void returnBook() {
        this.book = null;
    }

    public void printLoan() {
        // Etter returnBook er book null. Sjekken hindrer kallet på getTitle
        // gjennom en null-referanse.
        if (book == null) {
            System.out.println(name + " har ingen bok");
        } else {
            System.out.println(name + " har lånt " + book.getTitle());
        }
    }
}
