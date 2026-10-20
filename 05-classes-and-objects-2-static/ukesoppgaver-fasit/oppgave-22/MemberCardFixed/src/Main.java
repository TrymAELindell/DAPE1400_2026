// Reference solution for exercise 22: the corrected run.
public class Main {
    public static void main(String[] args) {
        MemberCardFixed first = new MemberCardFixed("Natalia Kovalenko");
        MemberCardFixed second = new MemberCardFixed("Lars Moen");
        MemberCardFixed third = new MemberCardFixed("Amina Farah");

        System.out.println(first.getName() + " har medlemsnummer " + first.getMemberNr());
        System.out.println(second.getName() + " har medlemsnummer " + second.getMemberNr());
        System.out.println(third.getName() + " har medlemsnummer " + third.getMemberNr());
        System.out.println("Registrerte medlemmer: " + MemberCardFixed.getMembersRegistered());
    }
}
