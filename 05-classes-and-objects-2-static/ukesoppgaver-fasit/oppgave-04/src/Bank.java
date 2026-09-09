import javax.swing.JOptionPane;

// Reference solution for exercise 4.
public class Bank {
    public static void main(String[] args) {
        // Create an Account object from user input
        String ownerName = JOptionPane.showInputDialog("Kontoinnehaverens navn:");
        String accountNumber = JOptionPane.showInputDialog("Kontonummer:");
        String balanceInput = JOptionPane.showInputDialog("Startsaldo:");

        double balance;
        try {
            balance = Double.parseDouble(balanceInput);
        } catch (Exception e) {
            balance = 0;
            JOptionPane.showMessageDialog(null, "Saldo må være et tall. Setter saldo til 0.");
        }

        Account account = new Account(ownerName, accountNumber, balance);

        // Test all the methods in the Account class
        account.showAccountStatement();
        System.out.println(account.deposit(500));
        System.out.println(account.withdraw(200));
        System.out.println(account.withdraw(1_000_000));
        account.showAccountStatement();
    }
}
