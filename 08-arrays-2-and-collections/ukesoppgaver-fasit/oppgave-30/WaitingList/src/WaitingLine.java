import java.util.ArrayList;

// Reference solution for exercise 30: the work Amir does on the waiting list.
public class WaitingLine {

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
}
