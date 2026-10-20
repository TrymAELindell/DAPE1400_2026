import javax.swing.JOptionPane;

// Reference solution for exercise 51.
public class Main {
    public static void main(String[] args) {
        // Assumption: the daily sales can have a decimal part, so it is
        // read as a double; the customer count is a whole number.
        String salesInput = JOptionPane.showInputDialog("Hvor mye solgte du for i dag (kr)?");
        String customersInput = JOptionPane.showInputDialog("Hvor mange kunder hadde du i dag?");

        double sales;
        try {
            sales = Double.parseDouble(salesInput);
        } catch (Exception e) {
            sales = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — salget er satt til 0 kr");
        }

        int customers;
        try {
            customers = Integer.parseInt(customersInput);
        } catch (Exception e) {
            // Backup value 1, not 0: the program divides by this number.
            customers = 1;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall kunder er satt til 1");
        }

        // Assumption: "hva en vanlig kunde legger igjen" means the average:
        // the day's sales divided by the number of customers.
        // Assumption: the cafe had at least one customer today — the
        // program does not guard against dividing by zero.
        double averagePerCustomer = sales / customers;

        // Assumption: exactly 85 kr on average counts as enough.
        double requiredAverage = 85.0;

        String averageWithTwoDecimals = String.format("%.2f", averagePerCustomer);

        String message = "Du solgte for " + sales + " kr fordelt på " + customers
                + " kunder. En vanlig kunde la igjen " + averageWithTwoDecimals + " kr. ";

        if (averagePerCustomer >= requiredAverage) {
            message = message + "Det er nok til at kafeen går rundt.";
        } else {
            message = message + "Det er ikke nok til at kafeen går rundt.";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
