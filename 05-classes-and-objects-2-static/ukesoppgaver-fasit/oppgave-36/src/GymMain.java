// Reference solution for exercise 36.
public class GymMain {
    public static void main(String[] args) {
        GymMember firstMember = new GymMember("Zahra Hassan");
        GymMember secondMember = new GymMember("Jonas Vik");

        firstMember.printMonthlyBill();
        secondMember.printMonthlyBill();

        GymMember.setMonthlyFee(499.0);

        firstMember.printMonthlyBill();
        secondMember.printMonthlyBill();
    }
}
