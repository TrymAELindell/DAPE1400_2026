// Reference solution for exercise 36.
//
// The justification the task asks for: one static field for the monthly
// fee. The job says every member pays the same amount and that the amount
// changes - a static field is the one shape where the change happens once
// and every member is already up to date. An ordinary field would compile
// and run, which is what makes it the dangerous choice: each member would
// carry a copy of the fee, the raise would reach only the members created
// after it, and the two prices would sit side by side with nothing marking
// which is current. A constant was the other candidate and fails on the
// same clause: final would refuse the raise the job requires.
public class GymMember {
    private static double monthlyFee = 449.0;

    private String name;

    public GymMember(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printMonthlyBill() {
        System.out.println(this.name + " betaler " + monthlyFee + " kr denne måneden.");
    }

    public static double getMonthlyFee() {
        return monthlyFee;
    }

    public static void setMonthlyFee(double newMonthlyFee) {
        monthlyFee = newMonthlyFee;
    }
}
