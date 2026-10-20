// Reference solution for exercise 38 (Del 3): a gym member with a locker and a trainer.
public class Member {
    // Aggregation passer for treneren. Lise og Omar har den samme treneren, så
    // begge Member-objektene holder en referanse til det samme Trainer-objektet.
    // To String-fields for trenerens navn og nummer i hvert medlem ville også virket.
    // Men da må det nye nummeret settes inn hos hvert medlem for seg.
    //
    // Skapet er bare et nummer, så et vanlig int-field holder.
    // En egen Locker-klasse som del-objekt ville også virket. Men klassen ville bare
    // pakket inn ett tall.
    private String name;
    private int lockerNumber;
    private Trainer trainer;

    public Member(String name, int lockerNumber, Trainer trainer) {
        this.name = name;
        this.lockerNumber = lockerNumber;
        this.trainer = trainer;
    }

    public String toString() {
        return name + ": skap " + lockerNumber + ", trener " + trainer;
    }
}
