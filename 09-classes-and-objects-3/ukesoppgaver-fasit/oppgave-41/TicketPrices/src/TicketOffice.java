// Reference solution for exercise 41 (Del 3): the ticket prices.
public class TicketOffice {

    // Én metode med antall billetter som parameter passer her. Prisen regnes
    // ut på samme måte for alle antall, bare med en rabatt fra fire billetter.
    // To overloadede metoder, én uten parameter for én billett og én med, ville
    // kompilert og kjørt. Men da står den samme utregningen to steder, og en ny
    // pris må endres begge steder.
    // Å regne ut prisen rett i main ville også virket, men da står sjekken for
    // rabatten tre ganger.
    public static int computeTicketPrice(int count) {
        int pricePerTicket = 130;
        if (count >= 4) {
            pricePerTicket = pricePerTicket - 20;
        }
        return count * pricePerTicket;
    }

    public static void printPrice(int count) {
        if (count == 1) {
            System.out.println("1 billett: " + computeTicketPrice(count) + " kr");
        } else {
            System.out.println(count + " billetter: " + computeTicketPrice(count) + " kr");
        }
    }
}
