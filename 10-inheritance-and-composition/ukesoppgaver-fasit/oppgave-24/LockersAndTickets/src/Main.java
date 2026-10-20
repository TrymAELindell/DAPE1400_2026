// Reference solution for exercise 24 (Del 2): compare lockers and tickets.
public class Main {
    public static void main(String[] args) {
        Locker locker1 = new Locker(3, 7);
        Locker locker2 = new Locker(3, 7);
        Ticket ticket1 = new Ticket("A17");
        Ticket ticket2 = new Ticket("A17");

        System.out.println(locker1.equals(locker2)); // linje A
        System.out.println(ticket1 == ticket2);      // linje B
        System.out.println(ticket1.equals(ticket2)); // linje C
    }
}
