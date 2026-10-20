import javax.swing.JOptionPane;

// Reference solution for exercise 35 (Del 3). The calculation is reached straight
// through the class name - no IncomeTax object is ever created.
public class Main {
    public static void main(String[] args) {
        String incomeInput = JOptionPane.showInputDialog("Hva er årsinntekten din?");

        double income;
        try {
            income = Double.parseDouble(incomeInput);
        } catch (Exception e) {
            income = 0;
            JOptionPane.showMessageDialog(null, "Inntekt må være et tall. Bruker 0.");
        }

        // The three steps of the task, in order.
        System.out.println("Grunnskatt: " + IncomeTax.calculateBaseTax(income) + " kr");
        System.out.println("Trinnskatt: " + IncomeTax.calculateBracketTax(income) + " kr");
        System.out.println(IncomeTax.describeTax(income));

        JOptionPane.showMessageDialog(null, IncomeTax.describeTax(income));
    }
}
