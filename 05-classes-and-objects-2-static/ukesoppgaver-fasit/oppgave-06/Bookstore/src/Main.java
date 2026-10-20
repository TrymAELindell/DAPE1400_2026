// Reference solution for exercise 6.
public class Main {
    public static void main(String[] args) {
        // The static field exists before any Book object does
        System.out.println("Bokhandel: " + Book.getStoreName());

        Book firstBook = new Book("Sofies verden", "Jostein Gaarder");
        Book secondBook = new Book("Sult", "Knut Hamsun");

        firstBook.printBookInfo();
        secondBook.printBookInfo();

        // One change on the class is visible through every object
        Book.setStoreName("Bokhjørnet");

        firstBook.printBookInfo();
        secondBook.printBookInfo();
    }
}
