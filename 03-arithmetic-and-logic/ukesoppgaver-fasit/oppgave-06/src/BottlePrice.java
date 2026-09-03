import javax.swing.JOptionPane;

// Reference solution for exercise 6.
public class BottlePrice {
    public static void main(String[] args) {
        String totalPriceInput = JOptionPane.showInputDialog("Hva koster kassen (kr)?");
        String bottleCountInput = JOptionPane.showInputDialog("Hvor mange flasker er det i kassen?");

        double totalPrice = Double.parseDouble(totalPriceInput);
        int bottleCount = Integer.parseInt(bottleCountInput);

        // One operand is a double, so the division keeps its decimals even
        // though the bottle count is an int.
        double pricePerBottle = totalPrice / bottleCount;

        JOptionPane.showMessageDialog(null, "En flaske koster " + pricePerBottle + " kr");
    }
}
