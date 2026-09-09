import pricing.FeeReport;

// Reference solution for exercise 18.
//
// The line the task asks the student to try from out here -
//     System.out.println(FeeTable.getHandlingFee());
// - does not compile: getHandlingFee has package-private access in
// pricing.FeeTable, and this class is not in that package. Reaching the
// number through FeeReport, which is inside the package, is the way in.
public class FeeMain {
    public static void main(String[] args) {
        System.out.println(FeeReport.describeFees());
    }
}
