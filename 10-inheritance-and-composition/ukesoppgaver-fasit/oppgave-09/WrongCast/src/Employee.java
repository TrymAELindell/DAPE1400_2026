// Reference solution for exercise 9: the Employee class.
public class Employee {
    private String name;
    private int hourlyWage;

    public Employee(String name, int hourlyWage) {
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }

    public int calculateShiftPay(int hours) {
        return hours * hourlyWage;
    }

    public String toString() {
        return name + " (timelønn " + hourlyWage + " kr)";
    }
}
