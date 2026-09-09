package pricing;

// Reference solution for exercise 18: this class is inside pricing, so the
// package-private method in FeeTable is within reach. The same call
// written from a class outside the package does not compile - which is
// the whole point of the access level.
public class FeeReport {

    public static String describeFees() {
        return "Passasjeravgift: " + Tax.getPassengerFee() + " kr"
                + "\nGebyr: " + FeeTable.getHandlingFee() + " kr";
    }
}
