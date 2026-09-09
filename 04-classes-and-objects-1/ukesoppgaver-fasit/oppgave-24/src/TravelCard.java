// Reference solution for exercise 24 (explain the purpose): cardNumber is the
// card's identity and is made read-only simply by not having a setter.
public class TravelCard {
    private String cardNumber;
    private int balance;

    public TravelCard(String cardNumber, int balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void addMoney(int amount) {
        this.balance = this.balance + amount;
    }
}
