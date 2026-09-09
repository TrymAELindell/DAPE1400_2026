public class AirportTicketSystemV1 {
    public static void main(String[] args) {
        // The TicketV1 class lets us group name, personNr and destination into
        // one object, and print all of it with a single method call.
        TicketV1 ticket1 = new TicketV1("Trym", "24019189734", "Svalbard");
        ticket1.printTicketInfo();

        TicketV1 ticket2 = new TicketV1("Per", "19027189763", "Tromsø");
        ticket2.printTicketInfo();

        TicketV1 ticket3 = new TicketV1("Faid", "27026089670", "Algerie");
        ticket3.printTicketInfo();

        // A field can still be changed directly, like this:
        ticket1.name = "Kristian";
        // and that is a problem: the name changed but personNr did not. When
        // the passport is checked against the ticket at the airport, the
        // person number in the system will not match the one in the passport.
    }
}
