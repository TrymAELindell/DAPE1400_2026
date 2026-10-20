// Reference solution for exercise 34 (Del 3): one class for both kinds of ticket.
public class Ticket {
    // Én Ticket-klasse med et field for billettypen og et for prisen passer her.
    // De to billettypene skiller seg bare i data, ikke i hva de gjør.
    // To subklasser av Ticket, der hver overskriver getPrice, ville også virket. Men
    // da krever hver ny billettype en ny klasse bare for å bytte ut ett tall.
    // To arrays, én med navnene og én med prisene, ville også virket. Men da må de
    // to arrayene holdes i takt for hånd.
    private String typeName;
    private int price;

    public Ticket(String typeName, int price) {
        this.typeName = typeName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return typeName + ": " + price + " kr";
    }
}
