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

        // We should also handle the possibility that the user input text
        // instead of numberes. So we should add try catch blocks to the parsing.
        int adultCount = 0;
        try {
            int adultCount = Integer.parseInt(adultCountInput);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Antall voksenbilletter må være ett positivt heltall, antall billetter er satt til 0");
        }

        int childCount = 0;
        try {
            int childCount = Integer.parseInt(childCountInput);
        } catch (Excpetion e) {
            JOptionPane.showMessageDialog(null, "Antall barnebilleter må være ett positivt heltall, antall billetter er satt til 0");
        }

        double adultPrice = 150.0;
        // Calculated rather than written as 135.0, so the discount still
        // holds if the adult price is changed later.
        double childPrice = adultPrice * 0.9;

        double totalPrice = adultCount * adultPrice + childCount * childPrice;
        JOptionPane.showMessageDialog(null, "Totalsummen er " + totalPrice + " kr");
    }
}
