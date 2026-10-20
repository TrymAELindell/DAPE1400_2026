import javax.swing.JOptionPane;

// Reference solution for exercise 6: the same program reading from input dialogs
// and answering in a message dialog.
public class Main {
    public static void main(String[] args) {
        String title = JOptionPane.showInputDialog("Tittel:");
        String author = JOptionPane.showInputDialog("Forfatter:");
        String priceInput = JOptionPane.showInputDialog("Pris:");
        // showInputDialog always hands back a String, so the price has to be
        // converted before it can go into a double field.
        double price;
        try {
            price = Double.parseDouble(priceInput);
        } catch (Exception e) {
            price = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — prisen er satt til 0");
        }
        String isbn = JOptionPane.showInputDialog("ISBN:");

        Book book = new Book(title, price, author, isbn);
        JOptionPane.showMessageDialog(null, book.getBookInfo());
    }
}
