// Reference solution for exercise 10: move money between two accounts.
public class Bank {
    public static void transfer(BankAccount from, BankAccount to, int amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    // Moves the whole balance and returns the amount that was moved.
    public static int transfer(BankAccount from, BankAccount to) {
        int amount = from.getBalance();
        transfer(from, to, amount);
        return amount;
    }
}
