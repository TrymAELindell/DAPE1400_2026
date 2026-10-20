import java.util.ArrayList;

// Reference solution for exercise 13: a list of accounts and a variable that refers to one of them.
public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount());
        accounts.add(new BankAccount());
        accounts.add(new BankAccount());

        BankAccount account = accounts.get(1);
        account.deposit(250);

        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Konto " + i + ": " + accounts.get(i).getBalance() + " kr");
        }
    }
}
