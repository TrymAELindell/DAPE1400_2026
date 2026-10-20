import javax.swing.JOptionPane;

// Reference solution for exercise 37.
public class Main {
    public static void main(String[] args) {
        // Assumption: "jeg jobber sjelden hele timer" means the hours can
        // have a decimal part, so they are read as a double.
        String hoursInput = JOptionPane.showInputDialog("Hvor mange timer har du jobbet?");
        
        double hours = 0;
        try {
            hours = Double.parseDouble(hoursInput);
        } catch (Exception e) {
            JOptionPane.showInputDialog("Input må være ett positivt heltall. Antall timer er satt til 0");
        }

        // Assumption: the hourly rate and the VAT rate are fixed for now, so
        // they live in the code rather than being asked for every time.
        double hourlyRate = 750.0;
        double vatRate = 0.25;

        // Assumption: "750 kroner i timen" is the price before VAT, which is
        // how hourly rates are normally quoted between businesses.
        double amountBeforeVat = hours * hourlyRate;
        double amountToInvoice = amountBeforeVat * (1.0 + vatRate);

        // Assumption: Sara needs both numbers - the one she earns and the one
        // she writes on the invoice - so the message shows both.
        String message = hours + " timer à " + hourlyRate + " kr blir "
                + amountBeforeVat + " kr. Med 25 % moms skal du fakturere "
                + amountToInvoice + " kr.";
        JOptionPane.showMessageDialog(null, message);
    }
}
