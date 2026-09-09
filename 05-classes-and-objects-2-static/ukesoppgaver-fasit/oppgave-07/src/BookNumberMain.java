// Reference solution for exercise 7.
public class BookNumberMain {
    public static void main(String[] args) {
        Book firstBook = new Book("Sofies verden", "Jostein Gaarder");
        Book secondBook = new Book("Sult", "Knut Hamsun");
        Book thirdBook = new Book("Kristin Lavransdatter", "Sigrid Undset");

        System.out.println("Boknummer: " + firstBook.getBookNumber());
        System.out.println("Boknummer: " + secondBook.getBookNumber());
        System.out.println("Boknummer: " + thirdBook.getBookNumber());
        System.out.println("Registrerte bøker: " + Book.getBooksRegistered());
    }
}
