import java.util.ArrayList;

// Reference solution for exercise 17: the book stays in the catalogue after it is returned.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Sofies verden");
        ArrayList<Book> catalogue = new ArrayList<>();
        catalogue.add(book);

        Member member = new Member("Emma");
        member.borrow(book);
        System.out.println(member);

        member.returnBook();
        System.out.println(member);
        System.out.println("Katalogen har fortsatt: " + catalogue.get(0));
    }
}
