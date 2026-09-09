// Reference solution for exercise 22: the corrected class. The bug in the handout's version
// is that membersRegistered is an ordinary field: every object then gets
// its own counter, which starts at 0 and is raised to 1 in that object's
// own constructor, so every member ends up as number 1. Adding static
// moves the counter onto the class, where all the objects share it.
public class MemberCardFixed {
    private static int membersRegistered = 0;
    private String name;
    private int memberNr;

    public MemberCardFixed(String name) {
        this.name = name;
        membersRegistered++;
        this.memberNr = membersRegistered;
    }

    public String getName() {
        return this.name;
    }

    public int getMemberNr() {
        return this.memberNr;
    }

    public static int getMembersRegistered() {
        return membersRegistered;
    }
}
