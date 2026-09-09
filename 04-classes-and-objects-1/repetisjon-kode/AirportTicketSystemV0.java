// V0: the problem. Three tickets, nine loose variables. Nothing in the code
// says that person1Name, person1PersonNr and person1Destination belong to the
// same ticket -- that is only in our heads.
public class AirportTicketSystemV0 {
    public static void main(String[] args) {
        String person1Name = "Trym Lindell";
        String person1PersonNr = "24019189763";
        String person1Destination = "Japan";
        System.out.println("\nBillett");
        System.out.println("Navn: " + person1Name);
        System.out.println("PersonNr: " + person1PersonNr);
        System.out.println("Destinasjon: " + person1Destination);

        String person2Name = "Per Lauvås";
        String person2PersonNr = "01127078691";
        String person2Destination = "Kroatia";
        System.out.println("\nBillett");
        System.out.println("Navn: " + person2Name);
        System.out.println("PersonNr: " + person2PersonNr);
        System.out.println("Destinasjon: " + person2Destination);

        String person3Name = "Faid";
        String person3PersonNr = "28028456738";
        String person3Destination = "Algerie";
        System.out.println("\nBillett");
        System.out.println("Navn: " + person3Name);
        System.out.println("PersonNr: " + person3PersonNr);
        System.out.println("Destinasjon: " + person3Destination);
    }
}
