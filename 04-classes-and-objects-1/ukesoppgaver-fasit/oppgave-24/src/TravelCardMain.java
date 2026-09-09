// Reference solution for exercise 24: the balance can change, the card number
// cannot - there is simply no method that changes it.
public class TravelCardMain {
    public static void main(String[] args) {
        TravelCard card = new TravelCard("9001-4455", 80);
        card.addMoney(120);
        System.out.println("Kort " + card.getCardNumber() + " har saldo " + card.getBalance() + " kr");
    }
}
