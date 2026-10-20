// Reference solution for exercise 9: cast only after an instanceof check.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Barista("Mons", 195);

        // Uten instanceof-sjekken kompilerer casten, men programmet krasjer med
        // ClassCastException. Objektet er en Barista, ikke en ShiftLeader.
        if (employee instanceof ShiftLeader) {
            ShiftLeader leader = (ShiftLeader) employee;
            System.out.println(leader);
        } else {
            System.out.println(employee.getName() + " er ikke skiftleder");
        }
    }
}
