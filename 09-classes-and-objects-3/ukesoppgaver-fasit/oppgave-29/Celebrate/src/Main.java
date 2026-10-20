// Reference solution for exercise 29 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. int-varianten øker bare sin egen kopi,
// mens Person-varianten øker objektet som sofie refererer til.
public class Main {
    public static void main(String[] args) {
        int age = 20;
        Person sofie = new Person(20);

        Party.celebrate(age);
        Party.celebrate(sofie);

        System.out.println("age: " + age);
        System.out.println("sofie: " + sofie.getAge());
    }
}
