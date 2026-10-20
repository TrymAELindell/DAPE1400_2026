// Reference solution for exercise 9: a shift leader is an employee with a bonus.
public class ShiftLeader extends Employee {
    private int bonus;

    public ShiftLeader(String name, int hourlyWage, int bonus) {
        super(name, hourlyWage);
        this.bonus = bonus;
    }

    public int calculateShiftPay(int hours) {
        return super.calculateShiftPay(hours) + bonus;
    }

    public String toString() {
        return super.toString() + ", bonus " + bonus + " kr per vakt";
    }
}
