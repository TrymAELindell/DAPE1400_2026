import java.util.ArrayList;

// Reference solution for exercise 8: only the shift leader plans the shift.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Barista("Mons", 195));
        staff.add(new ShiftLeader("Ida", 210, 150));

        for (Employee employee : staff) {
            System.out.println(employee);
            if (employee instanceof ShiftLeader) {
                ShiftLeader leader = (ShiftLeader) employee;
                leader.planShift();
            }
        }
    }
}
