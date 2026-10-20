import java.util.ArrayList;

// Reference solution for exercise 16: the same book in the catalogue and on loan.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Sofies verden");
        ArrayList<Book> catalogue = new ArrayList<>();
        catalogue.add(book);

        Member member = new Member("Emma");
        member.borrow(book);

        System.out.println(member);
        System.out.println("Samme bok i katalogen og hos Emma: " + (catalogue.get(0) == member.getBook()));
    }
}
