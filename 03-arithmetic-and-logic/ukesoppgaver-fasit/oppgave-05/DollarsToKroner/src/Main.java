import javax.swing.JOptionPane;

// Reference solution for exercise 5.
public class Main {
    public static void main(String[] args) {
        String dollarsInput = JOptionPane.showInputDialog("Hvor mange amerikanske dollar (USD)?");
        double dollars;
        try {
            dollars = Double.parseDouble(dollarsInput);
        } catch (Exception e) {
            dollars = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — beløpet er satt til 0 USD");
        }

        // The exchange rate changes daily — this value is an example, and
        // students are asked to look up today's rate themselves.
        double kronerPerDollar = 10.5;

        double kroner = dollars * kronerPerDollar;

        JOptionPane.showMessageDialog(null,
                dollars + " USD er " + kroner + " norske kroner");
    }
}
