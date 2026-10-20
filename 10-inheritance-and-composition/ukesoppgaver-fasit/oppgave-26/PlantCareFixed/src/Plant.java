// Reference solution for exercise 26 (Del 2): the superclass.
public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public void water() {
        System.out.println(name + " får vann");
    }
}
