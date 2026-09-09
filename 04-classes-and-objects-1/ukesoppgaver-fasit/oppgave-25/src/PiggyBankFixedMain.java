// Reference solution for exercise 25: with the field updated, the deposit
// sticks - prints "Saldo: 150 kr".
public class PiggyBankFixedMain {
    public static void main(String[] args) {
        PiggyBankFixed bank = new PiggyBankFixed(100);
        bank.deposit(50);
        bank.printBalance();
    }
}
