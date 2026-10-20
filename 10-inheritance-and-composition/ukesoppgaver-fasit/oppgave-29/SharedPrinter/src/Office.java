// Reference solution for exercise 29 (Del 2): an office gets its printer from outside.
public class Office {
    private String name;
    private Printer printer;

    public Office(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    public void printReport(int pages) {
        printer.print(pages);
    }

    public String toString() {
        return name + ": " + printer.getPagesLeft() + " ark igjen";
    }
}
