// Reference solution for exercise 3: the Employee class, given in the handout.
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

    public String toString() {
        return name + " (timelønn " + hourlyWage + " kr)";
    }
}
