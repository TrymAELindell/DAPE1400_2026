// Reference solution for exercise 5: all employees in one array of the superclass type.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Barista("Mons", 195);
        employees[1] = new ShiftLeader("Ida", 210, 150);

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}
