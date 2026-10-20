// Reference solution for exercise 36.
//
// The justification the task asks for: one static field for the monthly
// fee. The job says every member pays the same fee, and that the fee goes
// up. With a static field, the program changes the fee once, and every
// member gets the new fee at the same time. An ordinary field would compile
// and run, and that is what makes it the dangerous choice. Each member
// would carry a copy of the fee. The new fee would reach only the members
// created after the change. The old fee and the new fee would then exist
// side by side, and nothing shows which one is current. A constant was the
// other candidate, and it fails on the same requirement. The keyword final
// would not let the program change the fee, and the job requires that
// change.
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
