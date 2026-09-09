import javax.swing.JOptionPane;

// Reference solution for exercise 6: the same program reading from input dialogs
// and answering in a message dialog.
public class BookDialogMain {
    public static void main(String[] args) {
        String title = JOptionPane.showInputDialog("Tittel:");
        String author = JOptionPane.showInputDialog("Forfatter:");
        // showInputDialog always hands back a String, so the price has to be
        // converted before it can go into a double field.
        double price = Double.parseDouble(JOptionPane.showInputDialog("Pris:"));
        String isbn = JOptionPane.showInputDialog("ISBN:");

        Book book = new Book(title, price, author, isbn);
        JOptionPane.showMessageDialog(null, book.getBookInfo());
    }
}
