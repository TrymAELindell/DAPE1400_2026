// Reference solution for exercises 14-17, built on TicketV2 from the lecture
// code.
public class TicketV3 {
    private String name;
    private String personNr;
    private String destination;

    public TicketV3(String name, String personNr, String destination) {
        if (this.hasValidPersonNr(personNr)) {
            this.name = name;
            this.personNr = personNr;
            this.destination = destination;
        } else {
            System.out.println("Advarsel: personnummeret hadde feil lengde. Billetten ble ikke opprettet.");
        }
    }

    public void setPassengerInfo(String name, String personNr) {
        if (this.hasValidPersonNr(personNr)) {
            this.name = name;
            this.personNr = personNr;
        } else {
            System.out.println("Advarsel: personnummeret hadde feil lengde. Passasjerinformasjonen ble ikke endret.");
        }
    }

    // Exercise 14: the length rule lives in one place, so the constructor
    // and the setter cannot disagree about what a valid person number is.
    // Private, because the check is the class's own business - making it
    // public would promise the outside world a method it has no need for.
    private boolean hasValidPersonNr(String personNr) {
        return personNr.length() == 11;
    }

    public String getDestination() {
        return this.destination;
    }

    // Exercise 15: private, because it is only used by printTicketInfo.
    // Making it public would be a decision to hand out the masked version -
    // defensible in a bigger system, but it should be a decision.
    private String getMaskedPersonNr() {
        return this.personNr.substring(0, 6) + "xxxxx";
    }

    // Exercise 16: the first six digits of a person number are the birth
    // date - two for day, two for month, two for year.
    public String getBirthDate() {
        return this.personNr.substring(0, 2)
                + "." + this.personNr.substring(2, 4)
                + "." + this.personNr.substring(4, 6);
    }

    public void printTicketInfo() {
        System.out.println("\nBillett");
        System.out.println("Navn: " + this.name);
        System.out.println("PersonNr: " + this.getMaskedPersonNr());
        System.out.println("Destinasjon: " + this.destination);
    }

    // Exercise 17: the check happens inside the class, so the unmasked
    // person number never leaves it. Strings are compared with equals, not ==.
    public boolean checkPersonNr(String personNr) {
        return this.personNr.equals(personNr);
    }
}
