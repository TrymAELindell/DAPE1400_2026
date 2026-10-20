// Reference solution for exercise 8. The counter belongs to the class and counts
// across every object; personNumber belongs to each object and keeps the
// value the counter had when that object was created.
public class Main {
    public static void main(String[] args) {
        Person first = new Person("Solveig", "Aune", "Kirkeveien 4", "22334455");
        Person second = new Person("Piotr", "Nowak", "Storgata 1", "99887766");
        Person third = new Person("Amina", "Farah", "Bergensgata 3", "45612378");

        System.out.println(first.getFirstName() + " har personnummer " + first.getPersonNumber());
        System.out.println(second.getFirstName() + " har personnummer " + second.getPersonNumber());
        System.out.println(third.getFirstName() + " har personnummer " + third.getPersonNumber());
        System.out.println("Registrerte personer: " + Person.getPersonsRegistered());
    }
}
