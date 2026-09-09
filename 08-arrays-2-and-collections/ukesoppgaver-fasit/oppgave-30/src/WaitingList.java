import java.util.ArrayList;
import javax.swing.JOptionPane;

// Reference solution for exercise 30 (Del 4): the waiting list for Amir's
// barbershop, Saks & Kam.
public class WaitingList {

    public static String serveNext(ArrayList<String> waitingCustomers) {
        // Assumption: "nestemann" is the customer who has waited longest,
        // so customers are served from the front of the list.
        if (waitingCustomers.size() == 0) {
            return "Ingen kunder venter";
        }
        String next = waitingCustomers.remove(0);
        return "Neste kunde: " + next;
    }

    public static String removeCustomer(ArrayList<String> waitingCustomers, String name) {
        // Assumption: a customer who leaves is crossed off by name; if the
        // name is not on the list, Amir is just told so.
        boolean wasRemoved = waitingCustomers.remove(name);
        if (wasRemoved) {
            return name + " er strøket fra lista";
        }
        return "Fant ikke " + name + " på lista";
    }

    public static String countWaiting(ArrayList<String> waitingCustomers) {
        if (waitingCustomers.size() == 1) {
            return "1 kunde venter";
        }
        return waitingCustomers.size() + " kunder venter";
    }

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
                JOptionPane.showMessageDialog(null, serveNext(waitingCustomers));
            } else if (choice.equals("3")) {
                String name = JOptionPane.showInputDialog("Hvem drar?");
                JOptionPane.showMessageDialog(null, removeCustomer(waitingCustomers, name));
            } else if (choice.equals("4")) {
                JOptionPane.showMessageDialog(null, countWaiting(waitingCustomers));
            }
        }
    }
}
