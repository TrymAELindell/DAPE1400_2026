// Reference solution for exercise 18 (predict the output): each object has its
// own values in the fields, and store gets its value at declaration.
public class GiftCard {
    private String store = "Bokkjelleren";
    private int balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }

    public void spend(int amount) {
        this.balance = this.balance - amount;
    }

    public void printBalance() {
        System.out.println(this.store + ": " + this.balance + " kr igjen");
    }
}
