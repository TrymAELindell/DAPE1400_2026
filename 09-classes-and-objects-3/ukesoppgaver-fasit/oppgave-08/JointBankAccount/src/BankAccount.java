// Reference solution for exercise 8: a bank account that starts at 0 kr.
public class BankAccount {
    private int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
