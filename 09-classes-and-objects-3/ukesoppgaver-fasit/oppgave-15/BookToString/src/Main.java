// Reference solution for exercise 15: print a book directly and in a concatenation.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Sofies verden", "Jostein Gaarder", 512);

        System.out.println(book);
        System.out.println("Ukas bok: " + book);
    }
}
