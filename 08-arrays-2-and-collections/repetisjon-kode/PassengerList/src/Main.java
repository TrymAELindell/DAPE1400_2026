import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        // Lager en ArrayList. Typen til elementene står inne i < >.
        ArrayList<String> passengerList = new ArrayList<>();

        // Med add-metoden legger vi til elementer i lista.
        passengerList.add("Kine");
        passengerList.add("Tobias");
        passengerList.add("Trym");

        // add finnes i to varianter. Varianten med indeks legger elementet på
        // den indeksen, og elementene etter det flytter én plass bakover.
        passengerList.add(2, "Per");

        // set bytter ut elementet på indeksen med et nytt element. Ingen
        // andre elementer flytter seg.
        passengerList.set(2, "Maria");

        // Klassen Collections har statiske metoder som virker på en ArrayList.
        // Her sorterer vi lista.
        Collections.sort(passengerList);

        // remove(element) returnerer true hvis elementet fantes i lista.
        // Loopen spør derfor om navn helt til brukeren skriver et navn som står i lista.
        String passengerName;
        do {
            passengerName = JOptionPane.showInputDialog("Please input name of passenger who canceled");
        } while (passengerList.remove(passengerName) == false);
    }
}
