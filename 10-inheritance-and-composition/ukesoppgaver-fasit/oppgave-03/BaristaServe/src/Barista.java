// Reference solution for exercise 3: a barista is an employee who serves drinks.
public class Barista extends Employee {
    public Barista(String name, int hourlyWage) {
        super(name, hourlyWage);
    }

    public void serve(String drink) {
        System.out.println(getName() + " serverer en " + drink);
    }
}
