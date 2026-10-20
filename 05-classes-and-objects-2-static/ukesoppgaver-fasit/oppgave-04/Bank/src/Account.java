import javax.swing.JOptionPane;

// Reference solution for exercise 4.
public class Account {
    private String ownerName;
    private String accountNumber;
    private double balance;

    public Account(String ownerName, String accountNumber, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showAccountStatement() {
        JOptionPane.showMessageDialog(null,
                "Kontoinnehaver: " + this.ownerName
                        + "\nKontonummer: " + this.accountNumber
                        + "\nSaldo: " + this.balance + " kr");
    }

    public String deposit(double amount) {
        this.balance = this.balance + amount;
        return "Satt inn " + amount + " kr. Ny saldo: " + this.balance + " kr";
    }

    public String withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return "Tatt ut " + amount + " kr. Ny saldo: " + this.balance + " kr";
        } else {
            return "Ikke dekning for uttak på " + amount + " kr. Saldo: " + this.balance + " kr";
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
