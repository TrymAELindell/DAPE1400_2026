// Reference solution for exercise 10: transfer between two accounts with both variants of transfer.
public class Main {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount();
        BankAccount checking = new BankAccount();
        savings.deposit(1000);
        checking.deposit(100);

        Bank.transfer(savings, checking, 300);
        System.out.println("Sparekonto: " + savings.getBalance() + " kr");
        System.out.println("Brukskonto: " + checking.getBalance() + " kr");

        int moved = Bank.transfer(checking, savings);
        System.out.println("Overført: " + moved + " kr");
        System.out.println("Sparekonto: " + savings.getBalance() + " kr");
        System.out.println("Brukskonto: " + checking.getBalance() + " kr");
    }
}
