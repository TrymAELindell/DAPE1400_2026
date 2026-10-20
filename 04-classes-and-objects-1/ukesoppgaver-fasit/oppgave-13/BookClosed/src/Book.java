// Reference solution for exercise 13. This is the finished class,
// after exercise 13; up to exercise 12 the fields are not yet private and
// the constructor has no title check.
//
// isbn is a String, not a number: an ISBN may start with 0 and may contain
// hyphens, both of which a numeric type would destroy. price is a double
// because a price has decimals.
public class Book {
    private String title;
    private double price;
    private String author;
    private String isbn;

    // Exercise 4: every book is sold in the same store, so the value is set
    // at declaration and no constructor parameter is needed.
    private String storeName = "Bokkjelleren";

    // Exercise 13: a book must have a title. The check runs before anything
    // is stored, so an invalid book keeps empty fields - the same trade-off
    // as the Ticket constructor from the lecture.
    public Book(String title, double price, String author, String isbn) {
        if (title.length() == 0) {
            System.out.println("Advarsel: tittelen kan ikke være tom. Boka ble ikke opprettet.");
        } else {
            this.title = title;
            this.price = price;
            this.author = author;
            this.isbn = isbn;
        }
    }

    public void printBookInfo() {
        System.out.println("\nBok");
        System.out.println("Tittel: " + this.title);
        System.out.println("Forfatter: " + this.author);
        System.out.println("Pris: " + this.price + " kr");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Selges hos: " + this.storeName);
    }

    // Exercise 6: the same information as one String, so it can go into a
    // message dialog.
    public String getBookInfo() {
        return "Tittel: " + this.title
                + "\nForfatter: " + this.author
                + "\nPris: " + this.price + " kr"
                + "\nISBN: " + this.isbn;
    }

    // Exercise 13: the price may change (sales), but never to a negative
    // number. The setter is the only way in, so the rule holds everywhere.
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Advarsel: prisen kan ikke være negativ. Prisen ble ikke endret.");
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        return this.price;
    }

    // Exercise 13: a getter and deliberately no setter - the ISBN identifies
    // the book and is read-only once the object exists.
    public String getIsbn() {
        return this.isbn;
    }
}
