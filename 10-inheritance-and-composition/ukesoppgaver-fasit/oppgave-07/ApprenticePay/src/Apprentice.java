// Reference solution for exercise 7: an apprentice is paid 40 kr less per hour.
public class Apprentice extends Employee {
    public Apprentice(String name, int hourlyWage) {
        super(name, hourlyWage);
    }

    public int calculateShiftPay(int hours) {
        return hours * (getHourlyWage() - 40);
    }
}
