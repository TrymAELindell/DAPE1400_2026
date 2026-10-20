// Reference solution for exercise 8: two variables share one bank account.
public class Main {
    public static void main(String[] args) {
        BankAccount mariaAccount = new BankAccount();
        BankAccount sharedAccount = mariaAccount;

        mariaAccount.deposit(500);
        sharedAccount.withdraw(200);

        System.out.println("Maria ser: " + mariaAccount.getBalance() + " kr");
        System.out.println("Felles ser: " + sharedAccount.getBalance() + " kr");
    }
}
