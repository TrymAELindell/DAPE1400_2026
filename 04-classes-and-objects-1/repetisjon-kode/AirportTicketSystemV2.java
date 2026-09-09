public class AirportTicketSystemV2 {
    public static void main(String[] args) {
        // A ticket for Trym, who is going to Svalbard to run an AI workshop.
        TicketV2 ticket1 = new TicketV2("Trym", "24019189765", "Svalbard");
        ticket1.printTicketInfo();

        // Trym falls ill, so Kristian has to stand in. The three lines below
        // are commented out because none of them compiles or works:
        //
        // ticket1.name = "Kristian";
        //     -- does not compile: name is private
        // ticket1.setPassengerInfo("Kristian");
        //     -- does not compile: setPassengerInfo needs both name and personNr
        // ticket1.setPassengerInfo("Kristian", "0110701");
        //     -- compiles, but prints a warning and changes nothing:
        //        the person number has the wrong length

        // setPassengerInfo is the only way to change the passenger, and it
        // demands both values at once. That is what stops us from ending up
        // with one passenger's name and another's person number.
        ticket1.setPassengerInfo("Kristian", "01107012345");
        ticket1.printTicketInfo();

        // The destination can be read, but there is no setter for it.
        String destination = ticket1.getDestination();
        System.out.println("\nBilletten går til: " + destination);
    }
}
