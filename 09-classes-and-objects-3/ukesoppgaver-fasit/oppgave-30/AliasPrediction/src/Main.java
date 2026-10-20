// Reference solution for exercise 30 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. name += " Jr." lager en ny streng,
// så nameAlias refererer fortsatt til den gamle.
public class Main {
    public static void main(String[] args) {
        int year = 2025;
        int yearAlias = year;
        year += 1;

        Person trym = new Person(34);
        Person weds = trym;
        weds.incrementAge();

        String name = "Rusty";
        String nameAlias = name;
        name += " Jr.";

        System.out.println(yearAlias);
        System.out.println(trym.getAge());
        System.out.println(nameAlias);
    }
}
