import java.util.ArrayList;
import java.util.Collections;

// Reference solution for exercise 8: sort the passenger list with Collections.sort,
// then reverse it with Collections.reverse.
public class SortNames {

    public static ArrayList<String> createPassengerList() {
        ArrayList<String> passengerList = new ArrayList<>();
        passengerList.add("Gudrun Wolan");
        passengerList.add("Ellen Gleditsch");
        passengerList.add("Andrea Arntsen");
        passengerList.add("Grete Kittelsen");
        return passengerList;
    }

    public static void printList(ArrayList<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> passengerList = createPassengerList();

        System.out.println("Usortert:");
        printList(passengerList);

        Collections.sort(passengerList);
        System.out.println("Sortert:");
        printList(passengerList);

        Collections.reverse(passengerList);
        System.out.println("Baklengs:");
        printList(passengerList);
    }
}
