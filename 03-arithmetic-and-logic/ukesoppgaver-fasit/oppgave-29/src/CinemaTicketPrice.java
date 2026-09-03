import javax.swing.JOptionPane;

// Reference solution for exercise 29.
public class CinemaTicketPrice {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        int age = Integer.parseInt(ageInput);

        // The conditions are checked top to bottom, so "age <= 17" here
        // already means "at least 12" — the first branch took the rest.
        int price;
        if (age < 12) {
            price = 80;
        } else if (age <= 17) {
            price = 120;
        } else {
            price = 150;
        }

        JOptionPane.showMessageDialog(null,
                "En kinobillett koster " + price + " kr for deg.");
    }
}
