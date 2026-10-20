// Reference solution for exercise 18: prints
//   Bokkjelleren: 250 kr igjen
//   Bokkjelleren: 450 kr igjen
public class Main {
    public static void main(String[] args) {
        GiftCard card1 = new GiftCard(500);
        GiftCard card2 = new GiftCard(500);
        card1.spend(150);
        card1.spend(100);
        card2.spend(50);
        card1.printBalance();
        card2.printBalance();
    }
}
