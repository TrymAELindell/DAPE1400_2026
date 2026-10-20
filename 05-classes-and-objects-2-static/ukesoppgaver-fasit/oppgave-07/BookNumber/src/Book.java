// Reference solution for exercise 7.
//
// storeName is static: in module 04 every Book carried its own copy of the
// store name, and renaming the store meant touching every object. One
// static field is one value on the class, shared by all of them.
// The counter and bookNumber (exercise 7) follow the deck's ticket arc.
public class Book {
    private static String storeName = "Bokkjelleren";
    private static int booksRegistered = 0;

    private String title;
    private String author;
    private int bookNumber;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

        // No this. in front of the static field: it does not live in
        // this object, it lives on the class.
        booksRegistered++;
        this.bookNumber = booksRegistered;
    }

    public void printBookInfo() {
        System.out.println("Tittel: " + this.title);
        System.out.println("Forfatter: " + this.author);
        System.out.println("Selges hos: " + storeName);
    }

    public int getBookNumber() {
        return this.bookNumber;
    }

    // Static getter and setter: the store name belongs to the class, so
    // no object is needed to read or change it.
    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String newStoreName) {
        storeName = newStoreName;
    }

    public static int getBooksRegistered() {
        return booksRegistered;
    }
}
