// Reference solution for exercise 47 (Del 3).
public class Main {
    public static void main(String[] args) {
        // To lokale tellere, én for hver dør, passer her. Totalen er alltid
        // summen av de to, så den trenger ingen egen teller.
        // Et felles tellerobjekt som begge dørene har en referanse til, ville
        // også virket. Men da lagres totalen for seg, og den blir feil hvis
        // koden for én av dørene ikke øker den.
        // Et statisk field for totalen ville også virket, men da kan hele klassen
        // endre den.
        String[] entrances = {"hoveddøra", "garderobedøra", "hoveddøra", "hoveddøra", "garderobedøra"};

        int mainDoor = 0;
        int lockerRoomDoor = 0;
        for (String entrance : entrances) {
            if (entrance.equals("hoveddøra")) {
                mainDoor++;
            } else {
                lockerRoomDoor++;
            }
        }

        System.out.println("Hoveddøra: " + mainDoor);
        System.out.println("Garderobedøra: " + lockerRoomDoor);
        System.out.println("Totalt: " + (mainDoor + lockerRoomDoor));
    }
}
