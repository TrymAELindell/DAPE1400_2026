// Reference solution for exercise 29 (Del 2): the overloaded celebrate methods from the task.
public class Party {
    public static void celebrate(int age) {
        age += 1;
    }

    public static void celebrate(Person person) {
        person.incrementAge();
    }
}
