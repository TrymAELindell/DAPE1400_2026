// Reference solution for exercise 25 (find the bug): the broken version put
// the new sum in a local variable, which dies when the method ends. Money
// that should be remembered between calls has to live in a field.
public class PiggyBankFixed {
    private int balance;

    public PiggyBankFixed(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void printBalance() {
        System.out.println("Saldo: " + this.balance + " kr");
    }
}
