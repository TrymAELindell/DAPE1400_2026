import java.util.ArrayList;
import javax.swing.JOptionPane;

// Reference solution for exercise 48 (Del 3): read one person's items into the shared list.
public class ItemReader {

    // Én ArrayList i main og en metode som får referansen til den, passer her.
    // Metoden legger varene rett inn i den felles lista, så den trenger ikke
    // returnere noe.
    // En metode som lager og returnerer en ny liste for hver person, ville også
    // virket. Men da må main slå sammen de to listene etterpå.
    // Et statisk field for lista ville også virket. Men da kan alle metodene i
    // klassen endre lista, og kallet viser ikke lenger at addItems fyller den.
    public static void addItems(String person, ArrayList<String> shoppingList) {
        String item = JOptionPane.showInputDialog(person + ": hvilken vare?");
        while (item != null && !item.equals("ferdig")) {
            shoppingList.add(item);
            item = JOptionPane.showInputDialog(person + ": hvilken vare?");
        }
    }
}
