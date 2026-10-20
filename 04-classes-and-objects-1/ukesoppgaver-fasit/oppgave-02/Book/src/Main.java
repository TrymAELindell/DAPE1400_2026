// Reference solution for exercises 2-5: three Book objects and the two
// constructor experiments.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sofies verden", 249.0, "Jostein Gaarder", "82-03-26000-6");
        Book book2 = new Book("Java for begynnere", 549.0, "Kari Nordmann", "978-82-450-1234-5");
        Book book3 = new Book("Sult", 129.0, "Knut Hamsun", "0-14-044926-9");

        book1.printBookInfo();
        book2.printBookInfo();
        book3.printBookInfo();

        // Exercise 5, experiment 1: this line does not compile - the
        // constructor demands all four values. Uncomment it to see what the
        // compiler says.
        // Book broken = new Book("Sofies verden", 249.0, "Jostein Gaarder");

        // Exercise 5, experiment 2: this line compiles and runs, but the
        // author ends up as the title and vice versa - the constructor
        // matches values to parameters by position, not by meaning.
        // Book swapped = new Book("Jostein Gaarder", 249.0, "Sofies verden", "82-03-26000-6");
    }
}
