// Reference solution for exercise 30.
//
// The six-digit rule lives in the constructor: every Member that comes into
// existence passes through this one door, no matter where in the program it
// is created. Checking with if/else at each place a member is read in
// (module 03's tools) would give the same output for this program - at the
// cost that the rule exists only where someone remembered to copy it, and
// the third registration site is one forgotten copy away from bad data.
public class Member {
    private String name;
    private String memberNr;

    public Member(String name, String memberNr) {
        if (memberNr.length() == 6) {
            this.name = name;
            this.memberNr = memberNr;
            System.out.println("Registrert: " + name + " (" + memberNr + ")");
        } else {
            System.out.println("Advarsel: medlemsnummeret må ha seks siffer. " + name + " ble ikke registrert.");
        }
    }
}
