// Reference solution for exercise 29 (Del 2): the person from the task.
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void incrementAge() {
        age += 1;
    }

    public int getAge() {
        return age;
    }
}
