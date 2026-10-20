// Reference solution for exercise 39 (Del 3): a project group that uses a meeting room.
public class Group {
    // Aggregation passer her. Møterommet finnes uavhengig av gruppene, og begge
    // gruppene skal se den samme bookingen. Derfor holder begge en referanse til
    // det samme Room-objektet.
    // En HashMap med romnavnet som key og true eller false som verdi ville også
    // virket. Men da må hver gruppe slå opp romnavnet sitt, og en skrivefeil i
    // navnet gir et rom som ikke finnes.
    // Composition, der hver gruppe lager sitt eget Room-objekt, ville kompilert.
    // Men da får hver gruppe sin egen kopi, og bookingen til Nord vises ikke hos Sør.
    private String name;
    private Room room;

    public Group(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public void bookRoom() {
        if (room.book()) {
            System.out.println(name + " booker " + room.getName());
        } else {
            System.out.println(name + " kan ikke booke " + room.getName() + ", det er opptatt");
        }
    }

    public String toString() {
        return name + " bruker " + room;
    }
}
