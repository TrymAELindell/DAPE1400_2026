import javax.swing.JOptionPane;

// Reference solution for exercise 6.
public class Main {
    public static void main(String[] args) {
        String totalPriceInput = JOptionPane.showInputDialog("Hva koster kassen (kr)?");
        String bottleCountInput = JOptionPane.showInputDialog("Hvor mange flasker er det i kassen?");

        double totalPrice;
        try {
            totalPrice = Double.parseDouble(totalPriceInput);
        } catch (Exception e) {
            totalPrice = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — prisen er satt til 0 kr");
        }

        int bottleCount;
        try {
            bottleCount = Integer.parseInt(bottleCountInput);
        } catch (Exception e) {
            // Backup value 1, not 0: the program divides by this number.
            bottleCount = 1;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall flasker er satt til 1");
        }

        // One operand is a double, so the division keeps its decimals even
        // though the bottle count is an int.
        double pricePerBottle = totalPrice / bottleCount;

        JOptionPane.showMessageDialog(null, "En flaske koster " + pricePerBottle + " kr");
    }
}
