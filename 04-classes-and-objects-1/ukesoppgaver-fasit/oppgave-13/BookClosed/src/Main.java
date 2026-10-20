// Reference solution for exercise 13: the closed Book class and its rules.
public class Main {
    public static void main(String[] args) {
        // The title check: an empty title is rejected with a warning.
        Book noTitle = new Book("", 199.0, "Ukjent", "82-00-00000-0");

        Book book = new Book("Sult", 129.0, "Knut Hamsun", "0-14-044926-9");

        // The price rule holds on the only way in.
        book.setPrice(-50.0);
        book.setPrice(99.0);
        System.out.println("Pris: " + book.getPrice() + " kr");

        // Exercise 13, point 4: there is a getIsbn but deliberately no
        // setIsbn, so this line does not compile:
        // book.isbn = "0-00-000000-0";
    }
}
