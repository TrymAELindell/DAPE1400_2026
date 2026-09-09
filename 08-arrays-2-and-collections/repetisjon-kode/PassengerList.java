import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;


public class PassengerList {
    public static void main(String[] args) {

        // Creates an ArrayList. Note that the type the ArrayList stores goes inside < >.
        ArrayList<String> passengerList = new ArrayList<>();

        // Elements are added to an ArrayList with the add method.
        passengerList.add("Kine");
        passengerList.add("Tobias");
        passengerList.add("Trym");

        // The add method has two versions: one taking only an element as parameter,
        // and one taking an index and an element.
        // The first variant adds the element at the end of the list, while the variant
        // used below adds the element at the given index and pushes the other elements
        // one step back in the list.
        passengerList.add(2, "Per");

        // .set is a similar method, but instead of adding the element and pushing the
        // others back, the element at the index is replaced by the element given as parameter.
        passengerList.set(2, "Maria");

        // Since ArrayList is part of the Collections framework, we can use several static
        // methods from the Collections class to modify ArrayLists. Here the list is sorted.
        // Note that for a list to be sortable, its elements must be comparable in a
        // meaningful way. You will learn more about this later, but you can look up the
        // Comparable interface and the compareTo method if you are interested.
        Collections.sort(passengerList);

        // The .remove() method also comes in two variants. One takes an index as parameter,
        // removes the element at that index, and returns it.
        // The other takes an element as parameter and returns a boolean: false if the
        // element was not in the ArrayList, true if it was in the list before being removed.
        // This lets us use the remove() method in control-structure logic, as in the
        // while loop below, which asks for passenger names until a name that exists in
        // the list is given as input to remove.
        String passengerName;
        do {
            passengerName = JOptionPane.showInputDialog("Please input name of passenger who canceled");
        } while (passengerList.remove(passengerName) == false);



    }
}
