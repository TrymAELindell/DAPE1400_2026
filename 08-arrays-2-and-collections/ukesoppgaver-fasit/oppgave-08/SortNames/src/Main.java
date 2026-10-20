import java.util.ArrayList;
import java.util.Collections;

// Reference solution for exercise 8: sort the passenger list with Collections.sort,
// then reverse it with Collections.reverse.
public class Main {

    public static void main(String[] args) {
        ArrayList<String> passengerList = PassengerNames.createPassengerList();

        System.out.println("Usortert:");
        PassengerNames.printList(passengerList);

        Collections.sort(passengerList);
        System.out.println("Sortert:");
        PassengerNames.printList(passengerList);

        Collections.reverse(passengerList);
        System.out.println("Baklengs:");
        PassengerNames.printList(passengerList);
    }
}
