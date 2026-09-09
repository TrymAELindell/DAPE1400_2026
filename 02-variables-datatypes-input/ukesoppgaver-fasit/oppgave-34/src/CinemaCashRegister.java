import javax.swing.JOptionPane;

// Reference solution for exercise 34.
public class CinemaCashRegister {
    public static void main(String[] args) {
        String adultCountInput = JOptionPane.showInputDialog("Hvor mange voksenbilletter?");
        String childCountInput = JOptionPane.showInputDialog("Hvor mange barnebilletter?");

        // int for the ticket counts and double for the prices: a customer can
        // only buy whole tickets, while a discounted price need not be a whole
        // number of kroner. double for the counts would give the same total,
        // but it would also let the program accept an order for 2.5 tickets,
        // which the cinema cannot sell.

        // We should also handle the possibility that the user typed text
        // instead of numbers, so the parsing goes inside try/catch blocks.
        // The variables are declared before the try, so they are still
        // in scope after it; a variable declared inside the try block
        // would only exist there.
        int adultCount = 0;
        try {
            adultCount = Integer.parseInt(adultCountInput);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Antall voksenbilletter må være et positivt heltall, antall billetter er satt til 0");
        }

        int childCount = 0;
        try {
            childCount = Integer.parseInt(childCountInput);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Antall barnebilletter må være et positivt heltall, antall billetter er satt til 0");
        }

        double adultPrice = 150.0;
        // Calculated rather than written as 135.0, so the discount still
        // holds if the adult price is changed later.
        double childPrice = adultPrice * 0.9;

        double totalPrice = adultCount * adultPrice + childCount * childPrice;
        JOptionPane.showMessageDialog(null, "Totalsummen er " + totalPrice + " kr");
    }
}
