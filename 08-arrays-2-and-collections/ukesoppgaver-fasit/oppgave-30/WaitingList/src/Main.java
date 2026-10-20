import java.util.ArrayList;
import javax.swing.JOptionPane;

// Reference solution for exercise 30 (Del 4): the waiting list for Amir's
// barbershop, Saks & Kam.
public class Main {

    public static void main(String[] args) {
        // Assumption: the list only needs to live while the program runs —
        // nothing is stored when Amir closes it for the day.
        ArrayList<String> waitingCustomers = new ArrayList<>();

        String choice = "";
        // Assumption: closing the dialog counts as quitting, like choice 5.
        while (choice != null && !choice.equals("5")) {
            choice = JOptionPane.showInputDialog(
                    "1: ny kunde\n2: nestemann\n3: stryk kunde\n4: hvor mange venter?\n5: avslutt");

            if (choice == null) {
                break;
            }

            if (choice.equals("1")) {
                String name = JOptionPane.showInputDialog("Hvem kom inn?");
                waitingCustomers.add(name);
            } else if (choice.equals("2")) {
                JOptionPane.showMessageDialog(null, WaitingLine.serveNext(waitingCustomers));
            } else if (choice.equals("3")) {
                String name = JOptionPane.showInputDialog("Hvem drar?");
                JOptionPane.showMessageDialog(null, WaitingLine.removeCustomer(waitingCustomers, name));
            } else if (choice.equals("4")) {
                JOptionPane.showMessageDialog(null, WaitingLine.countWaiting(waitingCustomers));
            }
        }
    }
}
