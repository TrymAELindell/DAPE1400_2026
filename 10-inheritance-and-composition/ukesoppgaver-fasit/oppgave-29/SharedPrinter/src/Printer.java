// Reference solution for exercise 29 (Del 2): a printer with a paper tray.
public class Printer {
    private int pagesLeft;

    public Printer(int pagesLeft) {
        this.pagesLeft = pagesLeft;
    }

    public void print(int pages) {
        pagesLeft -= pages;
    }

    public int getPagesLeft() {
        return pagesLeft;
    }
}
