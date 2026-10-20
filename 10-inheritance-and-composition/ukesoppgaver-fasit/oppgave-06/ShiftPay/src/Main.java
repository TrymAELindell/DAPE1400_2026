import java.util.ArrayList;

// Reference solution for exercise 6: the pay for one six-hour shift, and the total.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Barista("Mons", 195));
        staff.add(new ShiftLeader("Ida", 210, 150));

        int total = 0;
        for (Employee employee : staff) {
            int pay = employee.calculateShiftPay(6);
            System.out.println(employee.getName() + ": " + pay + " kr");
            total += pay;
        }
        System.out.println("Til sammen: " + total + " kr");
    }
}
