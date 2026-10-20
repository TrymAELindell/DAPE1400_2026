// Reference solution for exercise 44 (Del 3): an account that can be opened with or without a deposit.
public class Account {
    private String owner;
    private int balance;

    public Account(String owner) {
        this.owner = owner;
    }

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String toString() {
        return owner + ": " + balance + " kr";
    }
}
